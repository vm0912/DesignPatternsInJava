package CreationalDesignPatterns.Builder;

/**
 * No need to write recursive generics in this example because all method invocations are available and valid.
 */
public class PersonBuilder {

    protected Person person;

    public PersonBuilder() {
        this.person =  new Person();
    }

    public PersonBasicInfoBuilder basicInfo(){
        return new PersonBasicInfoBuilder(person);
    }

    public PersonContactBuilder contact(){
        return new PersonContactBuilder(person);
    }

    public PersonJobInfoBuilder jobInfo(){
        return new PersonJobInfoBuilder(person);
    }

    public PersonAddressInfoBuilder addressInfo(){
        return new PersonAddressInfoBuilder(person);
    }

    public Person build(){
        return this.person;
    }
}
