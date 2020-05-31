package StructuralDesignPatterns.Proxy;


public class DogProxy extends Dog {


    public DogProxy(String name, String breed, Person owner) {
        super(name, breed, owner);
    }

    @Override
    public void runWithOwner() {
        Person owner = this.getOwner();
        if(owner.likesRunning()){
            super.runWithOwner();
        } else{
            System.out.println( owner.getName() + " doesn't like running, and will take " + this.getName() +" on a walk instead.");
        }
    }
}
