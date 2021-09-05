package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permute("ABC");



    }
    public static void permute(String per){
        if(per == null || per.length()==0){
            System.out.println("needs few letters");
            return;
        }
        permute("",per);
    }
    private static void permute(String prefix, String remaining){
        if(remaining.length()==0){
            System.out.println(prefix);
            return;
        }
        for(int i=0; i<remaining.length(); i++ ){
            permute(prefix +remaining.charAt(i), remaining.substring(0,i)+remaining.substring(i+1,remaining.length()));
        }
    }
}
