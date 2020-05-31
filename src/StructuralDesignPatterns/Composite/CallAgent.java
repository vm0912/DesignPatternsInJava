package StructuralDesignPatterns.Composite;

/**
 *The CallAgent class represents the leaf of the tree in the shown scenario.
 * It could be interacted with directly or through a group, but most importantly, in both ways,
 * the client interacts via mutual interface.
 * The downside of this implementation is the fact that the methods which handle nodes with children
 * are empty but had to be implemented in order to satisfy the interface contract.
 */
public class CallAgent implements Employee {
    private String name;
    private double salary;

    public CallAgent(String name,double salary){
        this.name = name;
        this.salary = salary;
    }


    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void printEmployeeTree() {
        System.out.println("\nEmployee's name: "+ this.name);
        System.out.println("Employee's salary: "+ this.salary);
        System.out.println("Occupation: " + this.getClass().getSimpleName());
    }
}
