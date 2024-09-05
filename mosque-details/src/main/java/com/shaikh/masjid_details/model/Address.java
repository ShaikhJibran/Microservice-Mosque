package com.shaikh.masjid_details.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    @Column(name = "ADDRESS_LINE_1", nullable = false)
    private String addressLine1;

    @Column(name = "ADDRESS_LINE_2", nullable = true)
    private String addressLine2;

    @Column(name = "LANDMARK", nullable = true)
    private String landmark;

    @Column(name = "SUB_LOCALITY", nullable = true)
    private String subLocality;

    @Column(name = "POST_CODE", nullable = false)
    private String postCode;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STATE", nullable = true)
    private String state;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @Column(name = "LATITUDE", nullable = true)
    private Double latitude;

    @Column(name = "LONGITUDE", nullable = true)
    private Double longitude;
}
