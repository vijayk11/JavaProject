package org.kurkundi.solutions.oops.inheritance;

public class ChessGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("CHess up");
    }

    @Override
    public void down() {
        System.out.println("Chess down");
    }

    @Override
    public void right() {
        System.out.println("Chess right");
    }

    @Override
    public void left() {
        System.out.println("Chess left");
    }
}
