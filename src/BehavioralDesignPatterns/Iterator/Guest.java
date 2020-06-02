package BehavioralDesignPatterns.Iterator;

/**
 * A simple representation of a guest used in a GuestCollection for iteration.
 * @author Vitomir M
 */
public class Guest {
    enum Gender{
        MALE,
        FEMALE,
        OTHER
    }
    private String name;
    private Gender gender;
    private String email;
    private boolean isSpecialGuest;

    public Guest(String name, Gender gender, String email, boolean isSpecialGuest) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.isSpecialGuest = isSpecialGuest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSpecialGuest() {
        return isSpecialGuest;
    }

    public void setSpecialGuest(boolean specialGuest) {
        isSpecialGuest = specialGuest;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", isSpecialGuest=" + isSpecialGuest +
                '}';
    }
}
