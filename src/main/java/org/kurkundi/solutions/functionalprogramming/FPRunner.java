package org.kurkundi.solutions.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FPRunner {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>(List.of(5,4,11,3,5,3,2,5,77,89,10));
        numbers.stream().distinct().sorted().map(e->e*e).forEach(System.out::println);

        //Printing sqaure of number of even from 1-10
        List<Integer> arrays = IntStream.rangeClosed(1,10).filter(e-> e%2==0)
                .map(e->e*e).boxed().toList();
        System.out.println(arrays.toString());

        int a=List.of(1,22,21,23,44).stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
        System.out.println(a);

    }
}
