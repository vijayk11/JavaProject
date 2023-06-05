package org.kurkundi.solutions.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramRunner {
    public  static  void main(String[] args){
        List<String> list = List.of("Apple","Banana","Cat","Dog","bat");
        printBasic(list);
        printFP(list);
        printFPEndsWith(list);
        printOnlyOddNumbers(new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9)));
    }

    private static void printOnlyOddNumbers(List<Integer> list){
        list.stream().filter(e -> e%2!=0).forEach(s -> System.out.println("Odd "+s));
    }

    private static void printBasic(List<String> list){
        for(String s: list){
            System.out.println(s);
        }
    }

    private static void printFP(List<String> list){
        list.stream().forEach(e -> System.out.println(e));
    }

    private static void printFPEndsWith(List<String> list){
        list.stream().filter(s -> s.endsWith("at")).forEach(e-> System.out.println("printFPEndsWith "+ e));
    }
}
