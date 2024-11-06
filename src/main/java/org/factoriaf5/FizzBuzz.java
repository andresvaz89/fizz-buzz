package org.factoriaf5;

public class FizzBuzz {
    public String fizzBuzz(int inputNumber) {
        String stringyfiedInputNumber = Integer.toString(inputNumber);

        if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
            return "FizzBuzz";
        } else if (inputNumber % 3 == 0 || stringyfiedInputNumber.contains("3")) {
            return "Fizz";
        } else if (inputNumber % 5 == 0 || stringyfiedInputNumber.contains("5")) {
            return "Buzz";
        } else {
            return Integer.toString(inputNumber);
        }
    }
}
