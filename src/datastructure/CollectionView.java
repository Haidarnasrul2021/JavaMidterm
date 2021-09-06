
package datastructure;

import java.util.Collection;
import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) throws Exception {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Chorachi");
        map.put(4, "Boston");
        map.put(5, "Chittagong");
        map.put(6, "Seattle");

        Collection<String> val= map.values();
        for(String st:val){
            System.out.println(st);
        }
    }
}


