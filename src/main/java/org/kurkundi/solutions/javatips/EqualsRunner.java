package org.kurkundi.solutions.javatips;

import java.util.Objects;

class Client{
    private int id;
    public Client(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class EqualsRunner {
    public static void main(String[] args){
        Client c1 = new Client(1);
        Client c2 = new Client(1);
        System.out.println(c1.equals(c2));
        // false because it just compare objects
        // location/Objects without cutom equals
        // true if custom equals is used



    }
}
