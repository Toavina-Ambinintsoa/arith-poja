package com.example.arith.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {

  public double add(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("only positive numbers accepted");
    }
    return a + b;
  }

  public double subtract(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("only positive numbers accepted");
    }
    return a - b;
  }

  public double multiply(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("only positive numbers accepted");
    }
    return a * b;
  }

  public double divide(int a, int b) {
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("only positive numbers accepted");
    }
    if (b == 0) {
      throw new IllegalArgumentException("cannot divide by 0");
    }
    return (double) a / b;
  }
}
