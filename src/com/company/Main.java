package com.company;

public class Main {

    public static boolean arePrimeFactors (int n, int[] array) {
        int divider = 2;
        int highestNumber = 0;
        int product = 1;
        boolean isAllPrime = true;
        for (int i = 0; i < array.length; i++) {
            if (highestNumber < array[i]) {
                highestNumber = array[i];
            }
        }
        for (int i = 0; i < highestNumber/2; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[k] % divider == 0 && divider != array[k]) {
                    array[k] = 0;
                }
            }
            divider++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                product = product * array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || product != n) {
                isAllPrime = false;
            }
        }
        return isAllPrime;
    }

    public static void main(String[] args) {
        int[] arrOfNumbers = {2, 3, 5, 7,};
        int n = 210;
        System.out.println(arePrimeFactors(n, arrOfNumbers));
    }
}
