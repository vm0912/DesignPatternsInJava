package BehavioralDesignPatterns.Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GuestCollection implements Iterable<GuestCollection> {

    private List<Guest> guestList;

    @Override
    public Iterator<GuestCollection> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super GuestCollection> action) {

    }

    @Override
    public Spliterator<GuestCollection> spliterator() {
        return null;
    }
}
