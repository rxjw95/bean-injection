package com.example.beaninjection.controller;

import com.example.beaninjection.service.ConstructorService;
import com.example.beaninjection.service.FieldService;
import com.example.beaninjection.service.SetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class guguController {

    @Autowired
    private FieldService fieldService;

    private SetterService setterService;

    private final ConstructorService constructorService;

    public guguController(ConstructorService constructorService) {
        this.constructorService = constructorService;
    }

    @Autowired
    public void setSetterService(SetterService setterService) {
        this.setterService = setterService;
    }
}
