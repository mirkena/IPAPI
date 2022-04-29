package com.dropwizard.IPAPI.controller.DTO;

import com.dropwizard.IPAPI.entity.*;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IPDetailDTO {

 private String status;
 @JsonUnwrapped
 private String IP;

 @JsonUnwrapped
 @OneToOne
 private Address address;

 @JsonUnwrapped
 @OneToOne
 private ISP isp;

 public void setIpLocator(IPLocator ipGeoDetailByIP) {
  setIsp(ipGeoDetailByIP.getIsp());
  setAddress(ipGeoDetailByIP.getAddress());
  setIP(ipGeoDetailByIP.getQuery());
  setStatus("success");
 }

//   private String IP;;
//   private String country;
//    private String countryCode;
//    private String region;
//    private String regionName;
//    private String city;
//    private String zip;
//    private String lat;
//    private String lon;
//    private String timezone;
//    private String isp;
//    private String org;
//    private String as;
}
