package dev.bernilai;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {

        StringBuilder reversed_word = new StringBuilder(word);
        reversed_word.reverse();

        return word.contentEquals(reversed_word);
    }
}
