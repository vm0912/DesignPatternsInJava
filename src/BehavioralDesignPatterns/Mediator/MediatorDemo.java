package BehavioralDesignPatterns.Mediator;


/**
 *A mediator design pattern represents a component that facilitates communication between other components
 * without them necessarily being aware of each other or having direct (reference) access to each other.
 * @author Vitomir M
 */
public class MediatorDemo {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();
        User bob = new User("Bob");
        chatRoom.addUser(bob);
        User alice = new User("Alice");
        User matt = new User("Matt");
        chatRoom.addUser(alice);
        chatRoom.addUser(matt);

        bob.sendPrivateMessage("Alice", "Hey, Alice!");
        alice.sendPublicMessage("Guys, sorry to disappoint you, but I'm running late for work, bye!");
        alice.leaveChatRoom();

    }
}
