package com.mercadolibre.fizzbuzz.core.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Printer implements Supplier<List<String>> {

  private final FizzBuzz fizzBuzz;

  public Printer(FizzBuzz fizzBuzz) {
    this.fizzBuzz = fizzBuzz;
  }

  @Override
  public List<String> get() {
    List<String> result = new ArrayList<>();
    for (int i = 1; i <= 100; i++) {
      result.add(fizzBuzz.apply(i));
    }
    return result;
  }
}
