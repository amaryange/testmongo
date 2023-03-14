package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;



}
