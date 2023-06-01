package org.kurkundi.solutions.oops.arraylist;

import java.util.ArrayList;

public class Book {
    int id;
    String name;
    ArrayList<Review> reviews =new ArrayList<>();

    Book(int id, String name){
        this.id =id;
        this.name=name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
}
