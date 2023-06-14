package org.kurkundi.solutions.javatips.package1;

public class MethodAccessRunnerInSamePackage {

    public static void main(String[] args){
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.defualtMethod();
        exampleClass.publicMethod();
         // exampleClass.privateMethod(); only this will give Compilation error
        exampleClass.protectedMethod();
    }
}
