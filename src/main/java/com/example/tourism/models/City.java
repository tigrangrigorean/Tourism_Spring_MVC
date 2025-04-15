package com.example.tourism.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private Long id;

    private String name;
    private String description;
    private String imageUrl;


}
