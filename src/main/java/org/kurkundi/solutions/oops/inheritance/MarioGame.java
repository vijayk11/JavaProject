package org.kurkundi.solutions.oops.inheritance;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Hole");
    }

    @Override
    public void right() {
        System.out.println("move right");
    }

    @Override
    public void left() {
        System.out.println("move left");
    }
}
