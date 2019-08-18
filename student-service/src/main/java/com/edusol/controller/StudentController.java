package com.edusol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(value={"/student"})
public class StudentController {


    @GetMapping("/get")
    public String getUserById() {
        System.out.println("I am in GET!!! " );
       
        return "success!!!";
    }
}
