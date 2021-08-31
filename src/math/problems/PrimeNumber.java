package math.problems;

public class PrimeNumber {
    public static void main(String[] args) {

    }
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

    }

}

    public static void main(String[] args) {

    }
    int n = 100;
		System.out.println(findPattern(n));


public static ArrayList findPattern(int n) {
        int count = 1;
        int j = 0;

        ArrayList<Integer> b = new ArrayList<>();

        int[] array1 = new int[40];

        while (n > 0) {
        for (int i = 0; i < 10; i++) {
        b.add(n);
        array1[j] = n;
        n -= count;
        j++;
        }
        count++;
        }
        return b;
        }
        }
