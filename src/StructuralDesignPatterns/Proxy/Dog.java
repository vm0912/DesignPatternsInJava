package StructuralDesignPatterns.Proxy;


public class Dog implements Playable {

    private String name;
    private String breed;
    private Person owner;

    public Dog(String name, String breed, Person owner) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public void runWithOwner() {
        System.out.println(this.name + " and " + this.owner.getName() + " are running together.");
    }

    public String getName() {
        return name;
    }

    public Person getOwner() {
        return owner;
    }
}
