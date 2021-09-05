package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};     //1
        int [] array2 = {18,25,41,47,17,36,14,19};  //1

        int min=array1[0];
        for(int i=1;i<array1.length;i++){
            if (min>array1[i]){
                min=array1[i];
            }
        }
        System.out.println("The lowest difference between the 2 array is==>"+min);


    }


}