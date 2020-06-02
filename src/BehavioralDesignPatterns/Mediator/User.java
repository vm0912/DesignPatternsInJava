package BehavioralDesignPatterns.Mediator;

/**
 * A chat app user which holds the reference to the mediator (chatRoom) in order to communicate
 * with other users.
 * The communication can be executed via public messages, or private messages.
 * @author Vitomir M
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendPrivateMessage(String receiversName, String message){
        if(chatRoom != null)
            chatRoom.sendPrivateMessage(this.name, receiversName, message);
    }

    public void sendPublicMessage(String message){
        if(chatRoom != null)
            chatRoom.postPublicMessage(name, message);
    }

    public void receiveMessage(String sender, String message, boolean isPrivate){
            System.out.println("User '" + name + "' receives a"+
                    ( isPrivate ? (" private ") : ("") )+ " message from '" + sender+ "'\""
                    + " : \"" + message + "\"");
    }


    public void leaveChatRoom(){
        if(chatRoom != null){
            chatRoom.removeUser(this);
            chatRoom = null;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
