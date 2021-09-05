package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        for(int num=2;num<=1000000;num++){
            int value=0;
            for(int j=3;j<=num-1;j++) {
                if (num % j == 0) {
                    value = value + 1;
                }
            }
            if(value==0) {
                System.out.println(num + " : is prime");
            }else{
                System.out.println(num+" : not prime");

            }
        }

    }

}