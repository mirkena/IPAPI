package com.dropwizard.IPAPI.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Service
public class CacheService {

    @Autowired
    net.sf.ehcache.CacheManager cacheManager;

    public void evictAllCaches() {
        cacheManager.clearAll();
    }

    @Scheduled(fixedRate = 60000)
    public void evictAllcachesAtIntervals() {
        evictAllCaches();
    }

//    @Scheduled(fixedRate = 2000)
//    public void reportCurrentTime() {
//        System.out.println("The time is now "+ new Date());
//    }

}

