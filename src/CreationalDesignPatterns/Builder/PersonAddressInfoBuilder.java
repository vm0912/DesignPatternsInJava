package CreationalDesignPatterns.Builder;

class PersonAddressInfoBuilder extends PersonBuilder {

    public PersonAddressInfoBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressInfoBuilder state(String state){
        this.person.setState(state);
        return this;
    }

    public PersonAddressInfoBuilder zipCode(String zipCode){
        this.person.setZipCode(zipCode);
        return this;
    }

    public PersonAddressInfoBuilder town(String town){
        this.person.setTown(town);
        return this;
    }

    public PersonAddressInfoBuilder streetAddress(String streetAddress){
        this.person.setStreetAddress(streetAddress);
        return this;
    }
}
