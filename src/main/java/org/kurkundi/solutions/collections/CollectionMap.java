package org.kurkundi.solutions.collections;

// Map doesnt implement Collection Interface

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMap {

    public static void main(String[] args){
        Map<String, Integer> map = Map.of("A",3,"B",5,"c",6);
        System.out.println(map); //{B=5, A=3, c=6}
        System.out.println(map.get("A") + " " + map.containsKey("B")+" "+map.containsValue(6));
        //3 true true

        Map<String,Integer> map1= new HashMap<>(map);
        map1.put("F",11);
        System.out.println(map1); // {A=3, B=5, c=6, F=11}

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A",25);
        linkedHashMap.put("Z",50);
        linkedHashMap.put("S",11);
        System.out.println(linkedHashMap); //{A=25, Z=50, S=11}

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A",25);
        treeMap.put("Z",50);
        treeMap.put("S",11);
        System.out.println(treeMap); //{A=25, S=11, Z=50}





    }
}
