package org.kurkundi.solutions.javatips.package2;

import org.kurkundi.solutions.javatips.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

    public static void main(String[] args){
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        /** all below will give compilation error
         exampleClass.defualtMethod();
        exampleClass.privateMethod();
        exampleClass.protectedMethod();
         */
    }
}
