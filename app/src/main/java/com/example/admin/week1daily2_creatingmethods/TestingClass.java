package com.example.admin.week1daily2_creatingmethods;


import java.util.ArrayList;
import java.util.List;

public class TestingClass {
    public static void main (String [] args){


        Solution hwork = new Solution();

        //    Testing Problem 1
        //    Create a function to print the duplicates in a list of strings
        System.out.println("teting problem 1");
        List<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("pork");
        strings.add("tiger");
        strings.add("cat");
        hwork.findDuplicates(strings);


        //    Testing Problem 2
        //    Create function to check if the string is a palindrome
        //    without using string.reverse() method
        System.out.println("testing problem 2");
        boolean isApalindrome = hwork.checkPalindrome("madam");
        System.out.println("is a Palindrome? " + isApalindrome);

        //    Testing Problem 3
        //    Create a function that will print
        //      "fizz" is the number is divisible by 3
        //      "buzz" is the number is divisible by 5
        //      "fizzbuzz" is the number is divisible by both
        //      and the integer for the rest
        //     You can use a for loop for using the first 20 integers
        System.out.println("testing problem 3");
        hwork.fizzBuzz(20);

        //    Testing Problem 4
        //    Create a function to check if the two strings are Anagrams
        //    Eg COAT and TACO would be anagrams
        boolean test = hwork.checkAnagrams("COAT", "TACO");
        System.out.println("Problem 4 Check Anagram COAT, TACO: " + test);

        //    Testing Problem 5
        //    Print a multiplication table from 1 to 10 using
        //    multidimensional array
        //    Output
        //    1 2 3 4 5 6 7 8 9 10
        //    2 4 6 8 10 12 14 16 18 20
        //    ...
        System.out.println("Problem 5 multiplication table ");
        hwork.printTables();


    }

}
