/**
 *  Java program to reverse string and check whether is it palindrome or not.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a string variable.
        String str = "abcba";

        // Creating SbringBuilder variable and assigning str value to it.
        StringBuilder sb = new StringBuilder(str);

        // Printing sb to console.
        System.out.println(sb);

        // Reversing sb from end to beginning.
        sb.reverse();

        // Creating a new string and assigning value of sb.
        String newString = sb.toString();

        // Checking if str and newString are palindromic.
        if (str.equals(newString)) {

            System.out.println("Yes");

        } else {

            System.out.println("No");

        }
    }
}