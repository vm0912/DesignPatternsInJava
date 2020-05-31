package StructuralDesignPatterns.Flyweight;

import java.time.LocalDate;

/**
 *Basic data of the user in a social network, overly simplified due to the fact it's not relevant for the
 * implementation of the Flyweight pattern.
 */
public class SocialNetworkUser {

    private String userName;
    private String fullName;
    private LocalDate dateOfBirth;

    public SocialNetworkUser(String username, String fullName, LocalDate dateOfBirth) {
        this.userName = username;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }


}
