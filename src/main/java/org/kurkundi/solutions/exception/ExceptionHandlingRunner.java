package org.kurkundi.solutions.exception;

public class ExceptionHandlingRunner {
    public static void main(String[] args){
        method1();
        System.out.println("Main ended");
    }

    /**
     * java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
     * 	at org.kurkundi.solutions.exception.ExceptionHandlingRunner.method1(ExceptionHandlingRunner.java:13)
     * 	at org.kurkundi.solutions.exception.ExceptionHandlingRunner.main(ExceptionHandlingRunner.java:5)
     */

    private static void method1(){
        method2();
        try{
            int[] a = new int[5];
            System.out.println(a[7]);
        }catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("Method 1 ended");
    }
    /**
    java.lang.NullPointerException: Cannot invoke "String.length()" because "string" is null
	at org.kurkundi.solutions.exception.ExceptionHandlingRunner.method2(ExceptionHandlingRunner.java:17)
	at org.kurkundi.solutions.exception.ExceptionHandlingRunner.method1(ExceptionHandlingRunner.java:10)
	at org.kurkundi.solutions.exception.ExceptionHandlingRunner.main(ExceptionHandlingRunner.java:5)
    Method 2 ended
    Method 1 ended
    Main ended
     */

    protected static void method2(){
        try{
            String string=null;
            string.length();
        }catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("Method 2 ended");
    }
}
