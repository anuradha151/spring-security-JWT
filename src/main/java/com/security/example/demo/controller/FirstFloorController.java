package com.security.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/floor1")
public class FirstFloorController {

    @GetMapping("office01")
    public ResponseEntity<?> enterOfizOne() {
        return new ResponseEntity<>("Enter ofiz ONE", HttpStatus.OK);
    }

    @GetMapping("office02")
    public ResponseEntity<?> enterOfizTwo() {
        return new ResponseEntity<>("Enter ofiz TWO", HttpStatus.OK);
    }
}
