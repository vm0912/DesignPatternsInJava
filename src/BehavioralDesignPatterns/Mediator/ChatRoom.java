package BehavioralDesignPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * A ChatRoom class that acts as a mediator. The users don't hold each others references, as
 * the mediator provides the main communication functionality.
 * @author Vitomir M
 */
public class ChatRoom {

    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        if(user.getChatRoom() == null){
            user.setChatRoom(this);
            users.add(user);
        }
        System.out.println("User '" + user.getName() + "'" + " has joined the chatRoom.");
    }

    public void removeUser(User user){
        if(users.remove(user)){
            System.out.println("User '" + user.getName() + "'" + " has left the chatRoom.");
        }
    }

    public void sendPrivateMessage(String sendersName, String receiversName, String message) {
        users.stream().filter( (user)->user.getName().equals(receiversName))
                .findFirst().ifPresent((user)-> user.receiveMessage(sendersName, message,true));
    }

    public void postPublicMessage(String sendersName, String message) {
        users.forEach((user) -> {
            if(user.getName()!= sendersName)
                 user.receiveMessage(sendersName,message,false);
        });
    }

    public List<User> getUsers() {
        return users;
    }
}
