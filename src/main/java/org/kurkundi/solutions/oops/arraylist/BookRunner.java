package org.kurkundi.solutions.oops.arraylist;

public class BookRunner {
    public static void main(String[] args){
        Book book1 = new Book(1, "Java Learning by Vijay");
        book1.addReview(new Review(1,"Good",5));
        System.out.println(book1);
    }
}
