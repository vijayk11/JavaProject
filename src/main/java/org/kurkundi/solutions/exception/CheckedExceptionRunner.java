package org.kurkundi.solutions.exception;

public class CheckedExceptionRunner {
    public static void main(String[] args){
        try {
            Thread.sleep(2000);
            method();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        // method();
        // if write here than need to write throws to main or write try/catch block

        /**
         * not required to write throws or try/catch block for method 2 because it is RTE
         *
         * because of below Exception Hirerarchy
         * class Error extends Throwable{}
         * class Exception extends Throwable{}
         * class InterruptedException extends Exception{}  -> called as Checked Exception
         * class RuntimeException extends Exception{}
         * class RuntimeException extends RuntimeException{}
         *
         * Two type os Exceptions:
         * 1.Run Time Exception and Subtype of Run Time Exception
         * 2.Which are not of (Run Time Exception and Subtype of Run Time Exception) -> Checked Exception
         */
        method2();

    }

    private static void method2() throws RuntimeException{

    }

    private static void method() throws InterruptedException{
        Thread.sleep(2000);
    }
}
