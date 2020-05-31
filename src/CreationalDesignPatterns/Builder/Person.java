package CreationalDesignPatterns.Builder;

/**
 *The Person class was modeled this way only for a simple demonstration of the builder design pattern.
 */
public class Person {

    //basic information
    private String name, gender;
    private int age;

    //contact
    private  String phoneNumber, email;

    //address information
    private  String state, zipCode, town, streetAddress;

    //job related information
    private  String company, position;
    private double monthlySalary;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    protected void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setState(String state) {
        this.state = state;
    }

    protected void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    protected void setTown(String town) {
        this.town = town;
    }

    protected void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    protected void setCompany(String company) {
        this.company = company;
    }

    protected void setPosition(String position) {
        this.position = position;
    }

    protected void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Person\n{" + "basic info: " +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", "+ " \ncontact info: "+
                "phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", "+ " \naddress info: "+
                "state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", town='" + town + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", "+ " \njob info: "+
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
