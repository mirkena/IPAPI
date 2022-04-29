package com.dropwizard.IPAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {

    @Id
    private String city;
    @OneToMany(mappedBy = "city")
    private List<Address> addresses;
    @ManyToOne
    private Region region;
    @ManyToOne
    private TimeZone timeZone;

}
