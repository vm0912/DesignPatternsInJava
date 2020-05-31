package StructuralDesignPatterns.Proxy;

public class Person {

    private String name;
    private boolean likesRunning;

    public Person(String name, boolean likesRunning) {
        this.name = name;
        this.likesRunning = likesRunning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean likesRunning() {
        return likesRunning;
    }

    public void setLikesRunning(boolean likesRunning) {
        this.likesRunning = likesRunning;
    }
}
