package com.dropwizard.IPAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IPLocator {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long code;
    @Column(name = "IP")
    private String query;


    @OneToOne
    private Address address;
    @OneToOne
    private ISP isp;



}
