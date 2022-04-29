package com.dropwizard.IPAPI.controller;

import com.dropwizard.IPAPI.controller.DTO.IPDetailDTO;
import com.dropwizard.IPAPI.entity.IPLocator;
import com.dropwizard.IPAPI.service.IPLocatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/ip")
public class IPLocatorController {

    @Autowired
    IPLocatorService service;


    @GetMapping
    public ResponseEntity<Object> getIPGeoDetail() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("http://ip-api.com/json/", Object.class);
    }

    @GetMapping("/{ip2}")
    public ResponseEntity<Object> getIPGeoDetailFlatten(@PathVariable String ip2) {
        if (service.getIPGeoDetailByIP(ip2) == null) {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForEntity("http://ip-api.com/json/" + ip2, Object.class);
        } else {
            IPDetailDTO detailDTO = new IPDetailDTO();
            detailDTO.setIpLocator(service.getIPGeoDetailByIP(ip2));
            return new ResponseEntity<>(detailDTO, HttpStatus.OK);
        }
    }
}