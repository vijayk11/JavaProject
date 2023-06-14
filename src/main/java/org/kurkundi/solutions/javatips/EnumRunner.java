package org.kurkundi.solutions.javatips;

import java.util.Arrays;

enum Season{
    WINTER, SPRING, SUMMER, FALL;
    // 0,1,2,3
}

enum Seasons{
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);
    private int value;
    private Seasons(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
public class EnumRunner {

    public static void main(String[] args){

        Season season = Season.FALL;
        // Season season = Season.valueOf("Winter");  error bcz small case
        Season season1 = Season.valueOf("WINTER");
        /**FALL
         FALL 0
         1
         [WINTER, SPRING, SUMMER, FALL]
         */
        System.out.println(season);
        System.out.println(season.name()+" "+season1.ordinal());
        System.out.println(Season.SPRING.ordinal());

        System.out.println(Arrays.toString(Season.values()));


        /**
         FALL
         WINTER 0
         Ordinal of SPRING 1
         Value of SPRING 2
         [WINTER, SPRING, SUMMER, FALL]
         3
         */

        Seasons season2 = Seasons.FALL;
        Seasons season3 = Seasons.valueOf("WINTER");
        System.out.println(season2);
        System.out.println(season3.name()+" "+season3.ordinal());
        System.out.println("Ordinal of SPRING " +Seasons.SPRING.ordinal());
        System.out.println("Value of SPRING " +Seasons.SPRING.getValue());
        System.out.println(Arrays.toString(Seasons.values()));
        System.out.println(Seasons.SUMMER.getValue());


    }
}
