package org.kurkundi.solutions.javatips.package1;

public class ExampleClass {
    public void publicMethod(){}
    private void privateMethod(){}
    protected void protectedMethod(){}
    void defualtMethod(){}

    public static void main(String[] args){
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.defualtMethod();
        exampleClass.publicMethod();
        exampleClass.privateMethod();
        exampleClass.protectedMethod();
    }
}
