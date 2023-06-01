package org.kurkundi.solutions.oops.arrays;


import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args){
        int[] marks = {90,95,100};
        Student vijay = new Student("vijay",marks);

        System.out.println(Arrays.toString(vijay.getMarks()));

        System.out.println("Total Sum of marks "+vijay.getTotalSumOfMarks());
        System.out.println("Maximum Mark obtained "+vijay.getMaximumMark());
        System.out.println("Minimum Maximum obtained "+vijay.getMinimumMark());

    }

}
