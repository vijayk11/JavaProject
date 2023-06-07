package org.kurkundi.solutions.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer>{
    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}

class  Print implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
public class LambdaBehindTheScreensRunner {

    public static void main(String[] args){
        List.of(1,232,43,54,45,6).stream().filter(n -> n%2 == 0).forEach(e-> System.out.println(e));

        // Predicate<? super T> predicate
        //boolean test(T t)

        List.of(1,2,3,4,5,6).stream().filter(new EvenNumberPredicate()).forEach(System.out::println);

        Predicate<Integer> predicate = e -> e%2==0 && e<5;
        List.of(1,2,3,4,5,6).stream().filter(predicate).forEach(System.out::println);

        // forEach(Consumer<? super T> action
        List.of(1,2,3,4,5,6).stream().filter(new EvenNumberPredicate()).forEach(new Print());

        Consumer<Integer> consumer = integer -> System.out.println(integer);
        List.of(1,2,3,4,5,6).stream().filter(predicate).forEach(consumer);

    }
}
