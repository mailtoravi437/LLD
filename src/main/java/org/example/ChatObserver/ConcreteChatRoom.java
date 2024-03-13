package org.example.ChatObserver;

import java.util.*;

public class ConcreteChatRoom implements Subject{
    private List<User> users;
    ConcreteChatRoom(){
        this.users = new ArrayList<>();
    }


    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void unregisterUser(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUser(String message) {
        for(User user : users){
            user.receiverMessage(message);
        }
    }

    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
        notifyUser(message);
    }
}
