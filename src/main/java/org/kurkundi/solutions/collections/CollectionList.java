package org.kurkundi.solutions.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

    public static void main(String[] args){
        List<String> fruits = List.of("Apple","Mango");
        System.out.println(fruits.size());
        // fruits.add("fruit"); -> Exception bcz Immutable

        List<String> fruitsArrayList = new ArrayList<>(fruits);
        fruitsArrayList.add("Kiwi");
        fruitsArrayList.forEach(f-> System.out.println(f.toUpperCase().concat(" is a fruit")) );
    }
}
