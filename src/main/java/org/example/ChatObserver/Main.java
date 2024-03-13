package org.example.ChatObserver;

public class Main {
    public static void main(String args[]){
        ConcreteChatRoom room = new ConcreteChatRoom();
        ConcreteUser user1 = new ConcreteUser("User 1");
        room.registerUser(user1);

        room.sendMessage("Welcome to Chat");
    }
}
