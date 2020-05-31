package StructuralDesignPatterns.Composite;

/**
 * The motivation for creating a Composite design pattern is to provide a uniform API which can be used in the same
 * manner regardless the quantity of the provided objects
 * (focus is on providing the same API for the single instance and for groups).
 * One of the main characteristics is the usage of recursion in order to traverse through the object tree.
 * Also known as the Client which uses the functionality of the Component interface.
 */
public class CompositeDemo {
    public static void main(String[] args) {

        //the root node in the tree representing the general manager
        Employee owner=new CompanyManager("Mark", 50000);

        Employee managerPeter=new CompanyManager("Peter",16000);
        Employee agentJohn=new CallAgent("John", 6000);
        Employee agentOliver=new CallAgent("Oliver", 6000);
        //John and Oliver are the child nodes of Peter
        managerPeter.add(agentJohn);
        managerPeter.add(agentOliver);
        //Peter is the child node of the owner Mark
        owner.add(managerPeter);
        //Rick is the child node of Peter
        Employee managerRick=new CompanyManager("Rick", 12000);
        managerPeter.add(managerRick);
        //Rick is Michael's direct superior
        Employee agentMichael=new CallAgent("Michael", 6500);
        managerRick.add(agentMichael);
        owner.printEmployeeTree();
    }
}
