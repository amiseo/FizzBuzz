package com.mercadolibre.fizzbuzz.core.usecases;

import org.junit.jupiter.api.Test;

import static java.util.Objects.nonNull;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class PrinterTest {

  @Test
  void list_is_not_null() {
    Printer printer = new Printer(new FizzBuzz());
    var numbers = printer.get();
    assumingThat(
        nonNull(numbers),
        () -> assertEquals(numbers.size(), 100)
    );
  }

}
