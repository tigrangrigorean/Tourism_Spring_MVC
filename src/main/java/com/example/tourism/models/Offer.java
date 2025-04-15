package com.example.tourism.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Offer {
    private Long id;

    private String title;
    private String description;
    private String imageUrl;
}
