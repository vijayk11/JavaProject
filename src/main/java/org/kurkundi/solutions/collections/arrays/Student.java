package org.kurkundi.solutions.collections.arrays;

public class Student {
    String name;
    int[] marks;
    public Student(){}
    public Student(String name, int[] marks){
        this.name =name;
        this.marks =marks;
    }
    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSumOfMarks(){
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        int max = Integer.MIN_VALUE;
        for(int mark: marks){
            if(max<mark){
                max=mark;
            }
        }
        return  max;
    }

    protected int getMinimumMark(){
        int min = Integer.MAX_VALUE;
        for(int mark: marks){
            if(min>mark){
                min = mark;
            }
        }
        return min;
    }

}
