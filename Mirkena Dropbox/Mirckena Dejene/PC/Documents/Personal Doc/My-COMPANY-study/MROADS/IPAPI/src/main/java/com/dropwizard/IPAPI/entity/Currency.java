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
public class Currency {
    @Id
    private String code;
    private String name;

    private String symbol;
    private String plural;

    @Override
    public String toString() {
        return code;
    }
}
