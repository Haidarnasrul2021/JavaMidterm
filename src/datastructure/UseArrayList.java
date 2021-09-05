package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(1, 25);
        ar.add(30);
        ar.add(40);
        ar.add(38);
        ar.add(50);

        //ar.remove(1);
        //ar.remove(3);

        for (int i : ar) {
            System.out.println(i);

        }


        System.out.println("The ArrayList items by using iterator interface:");

        Iterator iterator = ar.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        ar.remove(Integer.valueOf(25));
        System.out.println("Removed . Now the ArrayList content is:");
        for (Integer item : ar)
            System.out.println(item);

        System.out.println("Retrieving element at index 1: " + ar.get(1));


    }

}
