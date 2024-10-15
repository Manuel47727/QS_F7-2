package org.example;

public class Main {

//    public static void main(String[] args) {
//      System.out.println(isPrime(7));
//        System.out.println(isEven(9));
//        System.out.println(isMultiple(9, 4));
//    }

    public boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }
}
