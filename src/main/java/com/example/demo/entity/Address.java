package com.example.demo.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
@Data
public class Address {
    private String country;
    private String city;
    private String postCode;

}
