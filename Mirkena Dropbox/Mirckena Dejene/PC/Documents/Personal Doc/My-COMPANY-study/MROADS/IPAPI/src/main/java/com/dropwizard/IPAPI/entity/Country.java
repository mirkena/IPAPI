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
public class Country {

    @Id
    private String country;
    private String countryName;

    @ManyToOne
    private Continent continent;

    @ManyToOne
    private Currency currency;

    @OneToMany(mappedBy = "country")
    private List<Region> regions;

}
