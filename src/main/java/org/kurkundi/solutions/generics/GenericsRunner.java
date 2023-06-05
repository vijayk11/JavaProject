package org.kurkundi.solutions.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value){
        return value;
    }

    static  <X extends List> void duplicate(X value){
        value.addAll(value);
    }
    public static void main(String[] args){

        Integer value=doubleValue(Integer.valueOf(5));
        ArrayList list3 = doubleValue(new ArrayList());
        System.out.println(value+" "+list3); // 5 []
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicate(numbers);
        System.out.println(numbers); //[1, 2, 3, 1, 2, 3]



        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Vijay");
        list.addElement("Chutki");

        MyCustomList<Integer> list1 = new MyCustomList<>();
        list1.addElement(25);
        list1.addElement(22);

        System.out.println(list +" "+ list1);//[Vijay, Chutki] [25, 22]

        System.out.println(list.get(1)); // Chutki
    }
}
