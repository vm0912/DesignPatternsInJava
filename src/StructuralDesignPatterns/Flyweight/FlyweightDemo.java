package StructuralDesignPatterns.Flyweight;

import java.time.LocalDate;

/**
 *A Flyweight design pattern is a space optimization technique which allows less memory usage
 * by storing the data associated with similar objects externally.
 * The class FlyweightDemo represents a simple demonstration of the named pattern implementation.
 * @author Vitomir M
 */
public class FlyweightDemo {
    public static void main(String[] args) {

        //the problem with this class is that the name is not reusable/cached
        SocialNetworkUser firstUser = new SocialNetworkUser("username111",
                "Jack Black", LocalDate.of(1997,9 ,12));

        //improved class, implementing full name caching
        ImprovedSocialNetworkUser john65 = new ImprovedSocialNetworkUser(
                "john65", "John Thorne",LocalDate.of(1965,9 ,4 ));
        ImprovedSocialNetworkUser john01 = new ImprovedSocialNetworkUser(
                "john01", "John Ribbons",LocalDate.of(1965,9 ,4 ));
        ImprovedSocialNetworkUser scarlettJ = new ImprovedSocialNetworkUser(
                "scarlettJ", "Scarlett J. Ribbons",LocalDate.of(1988,11 ,22 ));

        System.out.println(scarlettJ.getFullName());
        int index = ImprovedSocialNetworkUser.namePartsStorage.indexOf("Ribbons");
        System.out.println("Last name 'Ribbons' index in the mutual storage: "
                + index);
        System.out.println("It corresponds to the last name index of the user '" + john01.getFullName() +"' : "
                + (john01.getLastNameIndex() == index) );
        System.out.println("It corresponds to the last name index of the user '" + scarlettJ.getFullName() +"' : "
                + (scarlettJ.getLastNameIndex() == index) );

    }
}
