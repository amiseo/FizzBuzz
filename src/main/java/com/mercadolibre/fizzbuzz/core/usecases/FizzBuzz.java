package com.mercadolibre.fizzbuzz.core.usecases;

import java.util.function.Function;

public class FizzBuzz implements Function<Integer, String> {

  public String apply(Integer num) {

      // number divisible by 3 and 5 will
      // always be divisible by 15, print
      // 'FizzBuzz' in place of the number
      if (num % 15 == 0)
        return "FizzBuzz";

        // number divisible by 3? print 'Fizz'
        // in place of the number
      else if (num %3  == 0)
        return "Fizz";

        // number divisible by 5, print 'Buzz'
        // in place of the number
      else if (num % 5 == 0)
        return "Buzz";

      else
        return num.toString();
    }
}
