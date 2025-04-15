package com.example.tourism.repositories;

import com.example.tourism.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class CityRepository {

    private List<City> tours = new ArrayList<>();
    private static CityRepository instance;
    private CityRepository() {

    }

    public static CityRepository getInstance() {
        if (instance == null) {
            instance = new CityRepository();
        }
        return instance;
    }

    public void save(City city) {
        tours.add(city);
    }

    public  List<City> getCityDB() {
        return tours;
    }

}
