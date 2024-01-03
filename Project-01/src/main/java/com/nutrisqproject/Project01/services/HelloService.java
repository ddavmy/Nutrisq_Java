package com.nutrisqproject.Project01.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "Hello World, nutrisq";
    }
}