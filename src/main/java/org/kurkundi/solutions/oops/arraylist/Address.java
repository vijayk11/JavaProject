package org.kurkundi.solutions.oops.arraylist;

public class Address {
    private String line;
    private String city;
    private String zip;
    Address(){}
    Address(String line, String city, String zip){
        this.line =line;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line='" + line + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
