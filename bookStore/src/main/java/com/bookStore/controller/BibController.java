package com.bookStore.controller;

import com.bookStore.repository.BibRepository;
import com.bookStore.service.BibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BibController {


    @Autowired
    private BibRepository bibRepository;


    @Autowired
    private BibService bibService;


    @GetMapping("/Bibliotheque")
    public String biblio(){
        return "Bibliotheque";
    }
}
