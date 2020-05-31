package StructuralDesignPatterns.Composite;

/**
 * Part of the Composite pattern called the Base Component.
 * Interface which provides the user-expected functionality, regardless of the cardinality of objects
 * (single instance or group of instances in a hierarchy).
 *
 */
public interface Employee {

    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public String getName();
    public double getSalary();
    public void printEmployeeTree();
}
