package com.example.tourism.services;

import com.example.tourism.models.City;
import com.example.tourism.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;

    public CityService() {
        cityRepository = CityRepository.getInstance();
    }

    public List<City> getAllCities() {
        return cityRepository.getCityDB();
    }
}
