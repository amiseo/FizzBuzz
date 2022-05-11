package com.mercadolibre.fizzbuzz.configuration;

import com.mercadolibre.fizzbuzz.core.usecases.FizzBuzz;
import com.mercadolibre.fizzbuzz.core.usecases.Printer;

public class Main {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Printer printer = new Printer(fizzBuzz);
    printer.get().forEach(System.out::println);
  }

}
