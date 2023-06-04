package org.kurkundi.solutions.collections;

import java.util.*;

public class CollectionSet {
    public static void main(String[] args){
        Set<String> fruits = Set.of("apple", "Apple","Mango");
        System.out.println(fruits);

        Set<String> fruits1 = new HashSet<>(fruits);
        System.out.println(fruits1.add("Apple")); // No Duplication in set
        fruits1.add("mango");
        System.out.println(fruits1);


        Set<Integer> numbers = new HashSet<>();
        numbers.add(1234);
        numbers.add(123);
        numbers.add(12);
        numbers.add(1);
        System.out.println(numbers);  //[1, 1234, 123, 12] doesnt care about insertion order

        Set<Integer> numbers1 = new LinkedHashSet<>();
        numbers1.add(1234);
        numbers1.add(123);
        numbers1.add(12);
        numbers1.add(1);
        System.out.println(numbers1); //[1234, 123, 12, 1] maintains insertion order

        Set<Integer> numberes2 = new TreeSet<>(numbers1);
        System.out.println(numberes2);  //[1, 12, 123, 1234] maintains sorted order

        List<Character> characters = List.of('A','Z','A','B','Z','F');
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet);  //[A, B, F, Z]

        Set<Character> linkedSet = new LinkedHashSet<>(characters);
        System.out.println(linkedSet);  //[A, Z, B, F]


    }

}
