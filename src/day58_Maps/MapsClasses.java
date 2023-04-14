package day58_Maps;

import java.util.*;

public class MapsClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();//Random order, faster
        hashMap.put(null, null);//accepts null
        System.out.println("hashMap = " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//insertion order
        linkedHashMap.put(null,null);//accepts null
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();//ascending order
        //treeMap.put(null,null);//does not accept null
        System.out.println("treeMap = " + treeMap);

        Map<String, Integer> hashTable = new Hashtable<>();//random order, is synchronized
        //hashTable.put(null,null);//does not accept null
        System.out.println("hashTable = " + hashTable);


    }

}
