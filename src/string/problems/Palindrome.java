
package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        palindromes("MOM");
    }

    public static String palindromes(String word){
        String reverse = "";
        int i =0;
        int j = word.length()-1;
        while(i<j){
            if(word.charAt(i) != word.charAt(j)){
                System.out.println("It is not a palindrome");
            }else{
                System.out.println("It is a palindrome");
            }
            i++;
            j--;
        }

        return word;
    }
}