package StructuralDesignPatterns.Flyweight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *Basic data of the user in a social network, overly simplified due to the fact it's not relevant for the
 * implementation of the Flyweight pattern.
 * Included the static list of the first and last names of the users as a memory optimization (Flyweight pattern
 * implementation).
 */
public class ImprovedSocialNetworkUser {

    static List<String> namePartsStorage = new ArrayList<>();
    // stores the indeces of the name parts in the mutual name parts storage
    private int[] names;
    private String userName;
    private String fullName;
    private LocalDate dateOfBirth;

    public ImprovedSocialNetworkUser(String username, String fullName, LocalDate dateOfBirth)
    {
        this.userName = username;
        this.dateOfBirth = dateOfBirth;
        Function<String, Integer> fetchOrAdd = (String namePart) -> {
            int namePartIndex = namePartsStorage.indexOf(namePart);
            if (namePartIndex != -1) return namePartIndex;
            else {
                namePartsStorage.add(namePart);
                return namePartsStorage.size() - 1;
            }
        };

        names = Arrays.stream(fullName.split(" "))
                .mapToInt(fetchOrAdd::apply).toArray();
    }

    public String getFullName()
    {
        return Arrays.stream(names).mapToObj(i -> namePartsStorage.get(i))
                .collect(Collectors.joining(","));
    }

    //for demonstration purposes
    public int getLastNameIndex(){
        return this.names[names.length-1];
    }


}
