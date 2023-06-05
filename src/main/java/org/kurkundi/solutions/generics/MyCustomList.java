package org.kurkundi.solutions.generics;

import java.util.ArrayList;

public class MyCustomList<T>{

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T value){
        list.add(value);
    }

    public void removeElement(T value){
        list.remove(value);
    }

    public  T get(int index){
        return  list.get(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
