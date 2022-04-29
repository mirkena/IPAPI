package com.dropwizard.IPAPI.service;


import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import net.sf.ehcache.config.CacheConfiguration;

@Configuration
@EnableCaching
public class cacheConfig extends CachingConfigurerSupport {

    @Bean
    public net.sf.ehcache.CacheManager ehCacheManager() {
        CacheConfiguration minuteCache = new CacheConfiguration();
        minuteCache.setName("IPLocator");
        minuteCache.setMemoryStoreEvictionPolicy("LRU");
        minuteCache.setMaxEntriesLocalHeap(1000);
        minuteCache.setTimeToLiveSeconds(600);


        net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
        config.addCache(minuteCache);
        return net.sf.ehcache.CacheManager.newInstance(config);
    }

    @Bean
    @Override
    public CacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheManager());
    }
}