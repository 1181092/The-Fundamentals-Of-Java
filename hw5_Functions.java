/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Functions;

import java.util.*;

/**
 *
 * @author mruna
 */
public class Functions {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String inputStr;
        String outputStr;
        String palindrome;
        boolean isPalindrome;
        int firstNumber;
        int secondNumber;
        int randNumber;

        //Reverses the String given
        System.out.println("Input a word: ");
        inputStr = read.next();
        outputStr = reverseString(inputStr);
        System.out.println("Your reverse word: " + outputStr);

        //Verifies if it is Palindrome
        isPalindrome = isPalindrome(inputStr, outputStr);
        palindrome = booleanToString(isPalindrome);
        System.out.println("Is your word a palindrome? " + palindrome);

        System.out.println("----------------------------------------");
        
        //Ramdomize        
        System.out.println("Insert the first number: ");
        firstNumber = read.nextInt();
        System.out.println("Insert the last number: ");
        secondNumber = read.nextInt();
        randNumber = getRandomNumber(firstNumber, secondNumber);
        System.out.println("Random number in between: " + randNumber);
    }

    public static String reverseString(String inputStr) {
        StringBuilder sb = new StringBuilder(inputStr);
        sb.reverse();
        return sb.toString();
    }

    public static boolean isPalindrome(String inputStr, String outputStr) {
        if (inputStr.equalsIgnoreCase(outputStr)) {
            return true;

        } else {
            return false;
        }
    }

    public static String booleanToString(boolean b) {
        return b ? "yes" : "no";
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
