package org.kurkundi.solutions.oops.inheritance;


abstract class Animal{
    abstract void  bark();
}

class Dog extends  Animal{
    @Override
    void bark(){
        System.out.println("Bow Bow");
    }
}

class Cat extends  Animal{
    @Override
    void bark(){
        System.out.println("Meow Meow");
    }
}

public class AnimalRunner {
    public static void main(String[] args){
        Animal[] animals = {new Dog(), new Cat()};
        for(Animal object: animals){
            object.bark();
        }
    }
}
