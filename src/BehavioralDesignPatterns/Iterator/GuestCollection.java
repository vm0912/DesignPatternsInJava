package BehavioralDesignPatterns.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


/**
 * GuestCollection class implementation.
 * @author Vitomir M
 */
public class GuestCollection implements Iterable<Guest> {

    private List<Guest> guestList;

    public GuestCollection(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public GuestIterator iterator() {
        System.out.println("GuestIterator called");
        return new GuestIterator(guestList);
    }

    @Override
    public void forEach(Consumer<? super Guest> action) {
        for(Guest guest : guestList){
            action.accept(guest);
        }
    }

    @Override
    public Spliterator<Guest> spliterator() {
        return null;
    }


}
