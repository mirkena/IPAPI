package com.dropwizard.IPAPI.repository;

import com.dropwizard.IPAPI.entity.IPLocator;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPLocatorRepository extends CrudRepository<IPLocator,Long> {

    @CacheEvict(value="IPLocator",beforeInvocation = true)
    @Cacheable(value="IPLocator")
    @Query("from IPLocator where IP= :ip")
    Optional<IPLocator> getIPGeoDetailByIP(@Param("ip") String ip);
}
