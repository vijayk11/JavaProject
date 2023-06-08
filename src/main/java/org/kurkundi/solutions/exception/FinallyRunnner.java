package org.kurkundi.solutions.exception;

import java.util.Scanner;

public class FinallyRunnner {

    /**
     * Finally block is always called even after exception or
     * any return call in the method
     *
     * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
     * 	at org.kurkundi.solutions.exception.FinallyRunnner.main(FinallyRunnner.java:21)
     * java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
     * 	at org.kurkundi.solutions.exception.FinallyRunnner.method(FinallyRunnner.java:35)
     * 	at org.kurkundi.solutions.exception.FinallyRunnner.main(FinallyRunnner.java:28)
     * before scanner close
     * before method ended
     * Main method end
     */
    public static void main(String[] args){
        Scanner scanner=null;
        try{
            scanner= new Scanner(System.in);
            int[] numbers = {1,2,3,4,5};
            int num = numbers[5];
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            System.out.println("before scanner close");
            scanner.close();
        }
      method();
        System.out.println("Main method end");
    }

    private static void method(){
        try{
            String str=null;
            str.length();
            return ;
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            System.out.println("before method ended");
            // executed above line even though ther is return statment
        }
        return ;
    }
}
