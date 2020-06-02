package BehavioralDesignPatterns.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 * A GuestIterator class implementation.
 *  In this iterator implementation, only the core functionality was provided,
 *  which includes hasNext() and next() methods.
 * @author Vitomir M
 */
public class GuestIterator implements Iterator<Guest>  {
        private List<Guest> guestList;
        private int position;

        public GuestIterator(List<Guest> guestList) {
            this.guestList = guestList;
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return (position < guestList.size());
        }

        @Override
        public Guest next() {
            return guestList.get(position++);
        }

}
