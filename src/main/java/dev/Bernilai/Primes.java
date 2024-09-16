package dev.Bernilai;

import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
