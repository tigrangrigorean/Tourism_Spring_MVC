package com.example.tourism.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/services")
public class ServiceController {

    @GetMapping
    public String showServicesPage(Model model) {
        return "services";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public String calculateExpenses(
            @RequestParam("travelers") int travelers,
            @RequestParam("luggage") int luggage,
            @RequestParam("serviceTier") String serviceTier,
            @RequestParam("days") int days) {

        System.out.println("Calculating expenses for: travelers=" + travelers + ", luggage=" + luggage + ", serviceTier=" + serviceTier + ", days=" + days);

        int baseCostPerDay;

        switch (serviceTier.toLowerCase()) {
            case "basic":
                baseCostPerDay = 5000;
                break;
            case "comfort":
                baseCostPerDay = 10000;
                break;
            case "luxury":
                baseCostPerDay = 20000;
                break;
            default:
                return "Invalid service tier provided";
        }

        if(days == 0) {
            days = 1;
        }
        if(travelers == 0) {
            travelers = 1;
        }
        if(luggage == 0) {
            luggage = 1;
        }

        int luggageCost = luggage * 100;
        int costPerTraveler = (baseCostPerDay + luggageCost) * days;
        int totalCost = costPerTraveler * travelers;

        return "Տուրի արժեքը: " + totalCost;
    }
}
