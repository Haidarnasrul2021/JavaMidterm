package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

    }

}
    int factorial1 = FactRecursion(5);
                System.out.println("Recursion: Factorial of 5 is: " + factorial1);

                        int factorial2=5;
                        System.out.println("Iteration: Factorial of "+factorial2+" is : "+factIteration(factorial2));
                        }

//Method for finding Factorial by Recursion
public static int factRecursion(int n) {
        int output;
        if (n == 1) {
        return 1;
        }
        output = factRecursion(n - 1) * n;
        return output;
        }

//Method for finding Factorial by Iteration
public static int factIteration(int n){
        int fact=1;
        for(int i=1; i<=n;i++){
        fact=fact*i;
        }
        return fact;
        }


        }