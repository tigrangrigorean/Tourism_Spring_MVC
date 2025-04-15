package com.example.tourism.controllers;

import com.example.tourism.models.Contact;
import com.example.tourism.repositories.ContactRepository;
import com.example.tourism.services.SimpleMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contacts")
public class ContactController {

//    @Autowired
//    private ContactRepository contactRepository;
    @Autowired
    private SimpleMailSender mailSender;

    @GetMapping
    public String showContactPage(Model model) {
        model.addAttribute("contact", new Contact());
        return "contacts";
    }

    @PostMapping
    public String submitContactForm(@ModelAttribute("contact") Contact contact) {
        String text = "Անուն: "+contact.getName() + "\n"
                + "Էլ. փոստ: " + contact.getEmail() + "\n"
                + "Հեռախոսահամար: " + contact.getPhone() + "\n"
                + "Նամակ: " +contact.getMessage();
        mailSender.sendSimpleMessage("tigrangrigoryan003@gmail.com","FROM travels", text);
//        contactRepository.save(contact);
        return "redirect:/contacts?success";
    }
}
