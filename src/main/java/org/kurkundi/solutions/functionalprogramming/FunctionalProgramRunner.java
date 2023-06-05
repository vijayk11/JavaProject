package org.kurkundi.solutions.functionalprogramming;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramRunner {
    public  static  void main(String[] args){
        List<String> list = List.of("Apple","Banana","Cat","Dog","bat");
        printBasic(list);
        printFP(list);
        printFPEndsWith(list);
        List<Integer> nums = new ArrayList<Integer>(List.of(1,2,7,2,3,4,4,5,6,7,8,9));
        printOnlyOddNumbers(nums);
        sumOfNumbers(nums);
        nums.stream().distinct().sorted().forEach(e-> System.out.println(e));
        nums.stream().distinct().filter(f -> f%2 == 0).map(m -> m*m).forEach(System.out::println);
    }

    private static void sumOfNumbers(List<Integer> list){
        System.out.println(list.stream().reduce(0, (n1,n2)->n1+n2));
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
