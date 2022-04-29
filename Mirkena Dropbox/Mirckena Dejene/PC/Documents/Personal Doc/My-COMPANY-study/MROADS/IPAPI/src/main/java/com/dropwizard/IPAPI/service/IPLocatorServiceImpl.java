package com.dropwizard.IPAPI.service;

import com.dropwizard.IPAPI.entity.IPLocator;
import com.dropwizard.IPAPI.repository.IPLocatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class IPLocatorServiceImpl implements IPLocatorService {

    @Autowired
    IPLocatorRepository repository;
    @Override
    public IPLocator getIPGeoDetailByIP(String ip) {

        if(repository.getIPGeoDetailByIP(ip).isEmpty()) {
          return null;
        }
        else
           return repository.getIPGeoDetailByIP(ip).get();

    }
}
