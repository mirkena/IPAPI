package com.dropwizard.IPAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Region {

    @Id
    private String region;
    private String regionName;
    @OneToMany(mappedBy = "region")
    private List<City> cities;
    @ManyToOne
    @JoinColumn(name = "countryCode")
    private Country country;

}
