package com.dropwizard.IPAPI.service;

import com.dropwizard.IPAPI.controller.DTO.IPDetailDTO;
import com.dropwizard.IPAPI.entity.IPLocator;
import org.springframework.stereotype.Service;

public interface IPLocatorService {
    IPLocator getIPGeoDetailByIP(String ip);
}
