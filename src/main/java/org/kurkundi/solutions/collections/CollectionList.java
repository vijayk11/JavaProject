package org.kurkundi.solutions.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionList {

     static String checkEndsWithle(String s){
        if(s.endsWith("le")) return s;
        else return null;
    }

    public static void main(String[] args){
        List<String> fruits = List.of("Apple","Mango");
        System.out.println(fruits.size());
        // fruits.add("fruit"); -> Exception bcz Immutable

        List<String> fruitsArrayList = new ArrayList<>(fruits);
        fruitsArrayList.add("Kiwi");
        fruitsArrayList.forEach(f-> System.out.println(f.toUpperCase().concat(" is a fruit")) );

        System.out.println(fruitsArrayList.stream().map(CollectionList::checkEndsWithle).collect(Collectors.toList()));

        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(Integer.valueOf(15));
        numbers.add(Integer.valueOf("12"));
        System.out.println(numbers);
    }
}
