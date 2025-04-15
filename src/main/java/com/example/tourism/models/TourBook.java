package com.example.tourism.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourBook {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int passengers;
    private String additionalInfo;
    private String cityName;
}
