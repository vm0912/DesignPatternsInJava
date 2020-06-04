package BehavioralDesignPatterns.Observer;

/**
 *An observer is an object that wishes to be informed about events happening in the system.
 * The entity generating the events is an observable.
 * The preferred way of implementation is using a PropertyChangeListener, what is shown
 * in the code below.
 * @author Vitomir M
 */
public class ObserverDemo {
    public static void main(String[] args) {
        YouTubeChannel observable = new YouTubeChannel();
        ChannelSubscriber observer = new ChannelSubscriber();

        observable.addPropertyChangeListener(observer);
        observable.uploadVideo("Solving 10000 piece puzzle in a day!");
    }
}
