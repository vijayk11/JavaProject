package org.kurkundi.solutions.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
    }
}

public class CollectionQueue {

    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>();
        System.out.println(queue.poll() +" " +queue.peek()); //null null

        queue.add("Apple");
        queue.offer("Banana");
        System.out.println(queue); //[Apple, Banana]
        System.out.println(queue.poll()); //Apple
        System.out.println(queue); //[Banana]

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.addAll(List.of("Cat","Monkey","Zebra"));
        System.out.println(queue1);   //[Cat, Monkey, Zebra]
        System.out.println(queue1.poll());  //Cat
        System.out.println(queue1.poll());  // Monkey
        System.out.println(queue1.poll()); // Zebra

        Queue<String> queue2 = new PriorityQueue<>(new StringLengthComparator());
        queue2.addAll(List.of("Cat","Monkey","Zebra"));
        System.out.println(queue2); // [Cat, Monkey, Zebra]
        System.out.println(queue2.poll()); // Cat
        System.out.println(queue2.poll()); //  Zebra
        System.out.println(queue2.poll()); //Monkey




    }
}
