package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {

    }
}
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String x="Army";
        String y="Mary";
        System.out.println("String x and String y are Anagram : "+checkAnagram(x,y));
    }

    public static boolean checkAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();

        char[] str1c=str1.toCharArray();
        Arrays.sort(str1c);

        char[] str2c=str2.toCharArray();
        Arrays.sort(str2c);
        return Arrays.equals(str1c,str2c);

    }
}