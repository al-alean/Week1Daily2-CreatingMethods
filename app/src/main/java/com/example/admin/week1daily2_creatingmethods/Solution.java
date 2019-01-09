package com.example.admin.week1daily2_creatingmethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    //    Problem 1
    //    Create a function to print the duplicates in a list of strings
    public void findDuplicates(List<String> strings){
        Set<String> store = new HashSet<>();
        for (String string : strings){
            if(store.add(string) == false){
                System.out.println("Found a duplicate: " + string);
            }
        }


    }


    //    Problem 2
    //    Create function to check if the string is a palindrome
    //    without using string.reverse() method
    public boolean checkPalindrome(String word){
        String original = word;
        String reversed = "";
        boolean isApalindrome = false;
        int lenght = original.length();

        for (int i = lenght - 1; i >= 0; i--){
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            isApalindrome = true;
        }
        return isApalindrome;
    }


    //    Problem 3
    //    Create a function that will print
    //      "fizz" is the number is divisible by 3
    //      "buzz" is the number is divisible by 5
    //      "fizzbuzz" is the number is divisible by both
    //      and the integer for the rest
    //     You can use a for loop for using the first 20 integers
    public void fizzBuzz(int count){
        boolean isDivisibleBy15 = false;
        boolean isDivisibleBy5 = false;
        boolean isDivisibleBy3 = false;

        for (int num = 1; num <= count; num++) {
            isDivisibleBy15 = num % 15 == 0;
            isDivisibleBy5 = num % 5 == 0;
            isDivisibleBy3 = num % 3 == 0;
            if (isDivisibleBy15){
                System.out.println(num + " " + "fizzbuzz");
            }else if (isDivisibleBy5){
                System.out.println(num + " " + "buzz");
            }else if (isDivisibleBy3){
                System.out.println(num + " " + "fizz");
            }else {
                System.out.println(num);
            }


        }

    }

    //    Problem 4
    //    Create a function to check if the two strings are Anagrams
    //    Eg COAT and TACO would be anagrams
    public boolean checkAnagrams(String word1, String word2){
        int word1Lenght = word1.length();
        int word2Lenght = word2.length();
        char [] word1ToCharArray = word1.toCharArray();
        char [] word2ToCharArray = word2.toCharArray();
        Arrays.sort(word1ToCharArray);
        Arrays.sort(word2ToCharArray);
        String word1string = new String(word1ToCharArray);
        String word2string = new String(word2ToCharArray);

        if (word1string.equals(word2string)) {
            return true;

        }else return false;
    }


    //    Problem 5
    //    Print a multiplication table from 1 to 10 using
    //    multidimensional array
    //    Output
    //    1 2 3 4 5 6 7 8 9 10
    //    2 4 6 8 10 12 14 16 18 20
    //    ...
    public void printTables(){
        int [][] twoDimArray = new int [10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){

                twoDimArray[i][j] = (i+1) * (j+1);

            }

        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){

                System.out.print(twoDimArray[i][j] + " ");

            }
            System.out.println();

        }

    }

}
