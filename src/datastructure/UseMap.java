package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        Map<String, List<String>> ls = new HashMap<>();

        ls.put("USA", Collections.singletonList("NY"));
        ls.put("India", Collections.singletonList("Kolkata"));
        ls.put("France", Collections.singletonList("Orleans"));
        ls.put("Bangladesh", Collections.singletonList("Dhaka"));
        ls.put("Canada", Collections.singletonList("Ontario"));


        for(String s:ls.keySet());

        Set set = ls.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry map1 = (Map.Entry) iterator.next();
            System.out.print("key is: " + map1.getKey() + " & Value is: ");
            System.out.println(map1.getValue());
        }
    }
}
