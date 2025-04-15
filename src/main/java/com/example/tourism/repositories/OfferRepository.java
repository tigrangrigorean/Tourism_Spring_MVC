package com.example.tourism.repositories;

import com.example.tourism.models.City;
import com.example.tourism.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class OfferRepository {

    private List<Offer> offers = new ArrayList<>();
    private static OfferRepository instance;
    private OfferRepository() {

    }

    public static OfferRepository getInstance() {
        if (instance == null) {
            instance = new OfferRepository();
        }
        return instance;
    }

    public void save(Offer offer) {
        offers.add(offer);
    }

    public  List<Offer> getOfferDB() {
        return offers;
    }

}
