package com.dropwizard.IPAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TimeZone {
    @Id
    private String timezone;
    private String abbr;
    private String utc;

    @Override
    public String toString() {
        return timezone;
    }
}
