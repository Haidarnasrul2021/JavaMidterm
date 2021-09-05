package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean result = true;

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Anagram.wordLength("CAT","ACT");
        Anagram.wordLength("PeAL","PEaK");
    }

    public static boolean wordLength(String w1, String w2) {
        //first we have to check if they have the same length
        if (w1.length() != w2.length()) {
            result = false;
        } else {
            //we want to make sure they are either in lowercase or uppercase and covert them to char array
            w1 = w1.toUpperCase();
            w2 = w2.toUpperCase();
            char[] word1Array = w1.toCharArray();
            char[] word2Array = w2.toCharArray();

            //sort both the arrays
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            result = Arrays.equals(word1Array, word2Array);
        }
        if (result == true) {
            System.out.println(w1 + " and " + w2 + " : Anagrams");

        } else {
            System.out.println(w1 + " and " + w2 + " : Not Anagrams");


        }
        return result;
    }
}
