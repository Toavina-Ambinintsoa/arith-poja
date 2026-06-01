package com.example.arith.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ArithTest {
  @InjectMocks private ArithService service;

  @Test
  void add_positive_number_ok() {
    assertEquals(3, service.add(1, 2));
  }

  @Test
  void add_same_number_ok() {
    assertEquals(4, service.add(2, 2));
  }

  @Test
  void add_negative_number_ko() {
    assertThrows(IllegalArgumentException.class, () -> service.add(2, -4));
    assertThrows(IllegalArgumentException.class, () -> service.add(-2, 4));
    assertThrows(IllegalArgumentException.class, () -> service.add(-2, -4));
  }

  @Test
  void add_floating_number_ko() {}

  @Test
  void subtract_positive_number_ok() {
    assertEquals(5, service.subtract(15, 10));
  }

  @Test
  void subtract_same_number_equals_0_ok() {
    assertEquals(0, service.subtract(15, 15));
  }

  @Test
  void substrate_negative_number_ko() {
    assertThrows(IllegalArgumentException.class, () -> service.subtract(2, -4));
    assertThrows(IllegalArgumentException.class, () -> service.subtract(-2, 4));
    assertThrows(IllegalArgumentException.class, () -> service.subtract(-2, -4));
  }

  @Test
  void multiply_positive_number_ok() {
    assertEquals(20, service.multiply(2, 10));
  }

  @Test
  void multiply_by_0_equals_0_ok() {
    assertEquals(0, service.multiply(0, 5));
  }

  @Test
  void mutiply_negative_number_ko() {
    assertThrows(IllegalArgumentException.class, () -> service.multiply(2, -4));
    assertThrows(IllegalArgumentException.class, () -> service.multiply(-2, 4));
    assertThrows(IllegalArgumentException.class, () -> service.multiply(-2, -4));
  }

  @Test
  void divide_two_positive_numbers_ok() {
    assertEquals(2, service.divide(18, 9));
  }

  @Test
  void divide_by_0_ko() {
    assertThrows(IllegalArgumentException.class, () -> service.divide(5, 0));
  }

  @Test
  void divide_return_float_number() {
    assertEquals(0.5, service.divide(1, 2));
  }

  @Test
  void divide_negative_number_ko() {
    assertThrows(IllegalArgumentException.class, () -> service.divide(2, -4));
    assertThrows(IllegalArgumentException.class, () -> service.divide(-2, 4));
    assertThrows(IllegalArgumentException.class, () -> service.divide(-2, -4));
  }
}
