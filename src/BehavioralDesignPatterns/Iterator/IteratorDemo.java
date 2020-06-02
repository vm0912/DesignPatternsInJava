package BehavioralDesignPatterns.Iterator;

import java.util.Arrays;
import java.util.List;

/**
 *A iterator represents an object that facilitates the traversal of a data structure.
 * @author Vitomir M
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Guest> guestList = Arrays.asList(
                new Guest("John Doe", Guest.Gender.MALE,"jdoe@gmail.com",false),
                new Guest("Mary Doe", Guest.Gender.FEMALE,"mdoe@gmail.com",true),
                new Guest("Peter McCallister", Guest.Gender.MALE,"pmccalister@homealone.com",true),
                new Guest("George R.R. Martin", Guest.Gender.MALE,"gmartin@got.com",true));

        GuestCollection guests = new GuestCollection(guestList);
        //using iterator directly
        GuestIterator iterator = guests.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------");
        //using the enhanced for loop
        for(Guest guest: guests){
            System.out.println(guest);
        }


    }
}
