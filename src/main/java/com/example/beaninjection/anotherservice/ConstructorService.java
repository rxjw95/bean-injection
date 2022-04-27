package com.example.beaninjection.anotherservice;

import org.springframework.stereotype.Service;

@Service
public class ConstructorService {
    public String getBye() {
        return "bye";
    }
}
