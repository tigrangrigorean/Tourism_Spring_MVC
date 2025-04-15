package com.example.tourism.controllers;

import com.example.tourism.models.City;
import com.example.tourism.models.Offer;
import com.example.tourism.models.TourBook;
import com.example.tourism.repositories.CityRepository;
import com.example.tourism.repositories.OfferRepository;
import com.example.tourism.services.SimpleMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class CityController {

    private CityRepository cityRepository;


    private OfferRepository offerRepository;

    private final SimpleMailSender mailSender;

    public CityController(SimpleMailSender mailSender) {
        this.cityRepository = CityRepository.getInstance();
        this.offerRepository = OfferRepository.getInstance();
        this.mailSender = mailSender;
    }

    @GetMapping
    public String index(Model model) {
        List<City> cities = cityRepository.getCityDB();
        model.addAttribute("cities", cities);
        return "index";
    }

    @GetMapping("/offers")
    public String showOffersPage(Model model) {
        List<Offer> offers = offerRepository.getOfferDB();
        model.addAttribute("offers", offers);
        return "offers";
    }


    @GetMapping("/tours")
    public String showToursPage(Model model) {
        List<City> cities = cityRepository.getCityDB();
        model.addAttribute("cities", cities);
        return "tours";
    }


    @PostMapping("/tour/book")
    public String submitContactForm(@ModelAttribute("tourBook") TourBook tourBook) {
        String text = "Տուր: "+tourBook.getCityName() + "\n"
                + "Անուն: "+tourBook.getFirstName() + "\n"
                + "Ազգանուն: " + tourBook.getLastName() + "\n"
                + "Հեռախոսահամար: " + tourBook.getPhoneNumber() + "\n"
                + "Ուղեվորների քանակը: " + tourBook.getPassengers() + "\n"
                + "Նամակ: " +tourBook.getAdditionalInfo();
        mailSender.sendSimpleMessage("tigrangrigoryan003@gmail.com","FROM travels", text);
        return "tours";
    }

}
