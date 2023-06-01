package org.kurkundi.solutions.oops.arraylist;

public class Review {
    int id;
    String comment;
    int rating;

    Review(int id, String comment,int rating){
        this.id=id;
        this.comment=comment;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return String.format("Id = %d, Comment = %s, Rating =%d ", id,comment,rating);
    }
}
