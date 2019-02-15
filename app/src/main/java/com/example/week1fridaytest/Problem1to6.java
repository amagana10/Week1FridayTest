package com.example.week1fridaytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1to6 {
    //    Problem 1
    //    Create a function to print the duplicates in a list of strings
    //    public void findDuplicates(List<String> strings){};
    public void findDuplicates(List<String> strings){
            final Set<String> doubles = new HashSet<String>();
            final Set<String> empty1 = new HashSet<String>();
            for (String s : strings) {
                if (!empty1.add(s)) {
                    doubles.add(s);
                }
            }
            System.out.println(doubles);

    }
    //    Problem 2
    //    Create function to check if the string is a palindrome
    //    without using string.reverse() method
    //    public boolean checkPalindrome(String word){};
    public boolean checkPalindrome(String word){
        int n = word.length();
        for( int i = 0; i < n/2; i++ ) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    //    Problem 3
    //    Create a function that will print
    //      "fizz" is the number is divisible by 3
    //      "buzz" is the number is divisible by 5
    //      "fizzbuzz" is the number is divisible by both
    //      and the integer for the rest
    //     You can use a for loop for using the first 20 integers
    //    public void fizzBuzz(int count){};
    public void fizzBuzz(int count){
        for (int i =1; i <= count; i++){
            String output ="";
            if(i%3 == 0){
                output = "fizz";

            }
            if(i%5 == 0){
                output = output + "buzz";
            }

            System.out.println(output  != ""? output:i);
        }
    }
    //    Problem 4
    //    Create a function to check if the two strings are Anagrams
    //    Eg COAT and TACO would be anagrams
    //    public boolean checkAnagrams(String word1, String word2){};
    public boolean checkAnagrams(String word1, String word2){
        int n1 = word1.length();
        int n2 = word2.length();
        if (n1 != n2)
            return false;
        //make string into arrays
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        // Sort both strings
        Arrays.sort(w1);
        Arrays.sort(w2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (w1[i] != w2[i])
                return false;

        return true;
    }
    //    Problem 5
    //    Print a multiplication table from 1 to 10 using
    //    multidimensional array
    //    Output
    //    1 2 3 4 5 6 7 8 9 10
    //    2 4 6 8 10 12 14 16 18 20
    //    ...
    //    public void printTables(){};
    public void printTables(){
        int[][] table = new int[10][10];
        for (int row = 0; row < table.length;row++){
            for (int colunm = 0; colunm < table[row].length;colunm++ ){
                System.out.print((row+1)*(colunm+1) + " ");
            }
            System.out.println("");
        }

    //   Problem 6
    //   Given a 2d String array, write a method that will return a list with all the positions of
    //   dulpicate entries.   For example:

    //        a,b,c
    //       d,e,f
    //        g,a,b
    //
    //        will return {0,0 | 0,1 | 2,1 | , 2,2 }
    //public List<int>

    }
    public static void main(String[] args) {
        Problem1to6 test = new Problem1to6();

        List<String> l = new ArrayList<String>();
        l.add("num1");
        l.add("num2");
        l.add("num3");
        l.add("num4");
        l.add("num2");
        l.add("num3");
        l.add("num4");
        System.out.println(l);
        test.findDuplicates(l);

        String pal = "racecar";
        String notPal = "racer";
        System.out.println(test.checkPalindrome(pal)? pal + " is a palindrome" : "something is wrong");
        System.out.println(test.checkPalindrome(notPal)? notPal + " something is wrong" : notPal + " is not a palindrome");

        test.fizzBuzz(20);


        System.out.println("taco and coat " + (test.checkAnagrams("taco","coat")? "are anagrams":"something is wrong"));

        test.printTables();

    }
}
