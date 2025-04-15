package com.example.tourism.repositories;

import com.example.tourism.models.City;
import com.example.tourism.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
