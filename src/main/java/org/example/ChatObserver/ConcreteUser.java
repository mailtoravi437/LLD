package org.example.ChatObserver;

public class ConcreteUser implements User {
    private String username;
    ConcreteUser(String username) {
        this.username = username;
    }

    @Override
    public void receiverMessage(String message) {
        System.out.println("Message: " + message);
    }
}
