package StructuralDesignPatterns.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The CompanyManager is a tree node that can either have children or be a leaf of the tree.
 * In other words, it can provide a single object, or a group of objects.
 *It is a implementation of the Composite.
 */
public class CompanyManager implements Employee {

    private String name;
    private double salary;

    public CompanyManager(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printEmployeeTree() {

        System.out.println("\nEmployee's name: "+ this.name);
        System.out.println("Employee's salary: "+ this.salary);
        System.out.println("Occupation: " + this.getClass().getSimpleName());

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.printEmployeeTree();
        }
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }
}
