package com.example.demo.endpoint.rest.controller.health;

import com.example.arith.service.ArithService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ArithController {
  private ArithService service;

  @GetMapping("/add")
  public double add(@RequestParam int a, @RequestParam int b) {

    return service.add(a, b);
  }

  @GetMapping("/substrate")
  public double subtract(@RequestParam int a, @RequestParam int b) {
    return service.subtract(a, b);
  }

  @GetMapping("/multiply")
  public double multiply(@RequestParam int a, @RequestParam int b) {
    return service.multiply(a, b);
  }

  @GetMapping("/divide")
  public double divide(@RequestParam int a, @RequestParam int b) {
    return service.divide(a, b);
  }
}