package com.edu.EXAQUISPEJBACK.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.EXAQUISPEJBACK.entity.biblioteca;
import com.edu.EXAQUISPEJBACK.service.bibliotecaservice;
@CrossOrigin(origins = "http//localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/libros"})
public class bibliotecacontroller {
@Autowired
private bibliotecaservice bibliotecaservice;
@GetMapping
public List<biblioteca> mensaje(){
	return bibliotecaservice.readAll();
	
}
}
