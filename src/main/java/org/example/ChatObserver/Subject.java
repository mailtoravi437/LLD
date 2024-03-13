package org.example.ChatObserver;

public interface Subject {
    void registerUser(User user);
    void unregisterUser(User user);
    void notifyUser(String message);
}
