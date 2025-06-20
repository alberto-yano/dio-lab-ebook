package com.example.teste_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/v1/teste" )
public class TesteController {

  @GetMapping( "/t1" )
  public ResponseEntity<String> t1() {
    return ResponseEntity.ok( "Hello World" );
  }

}
