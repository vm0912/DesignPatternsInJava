package CreationalDesignPatterns.Builder;

 class PersonBasicInfoBuilder extends PersonBuilder {

    public PersonBasicInfoBuilder(Person person) {
        this.person = person;
    }

    public PersonBasicInfoBuilder name(String name) {
        this.person.setName(name);
        return this;
    }

    public PersonBasicInfoBuilder age(int age) {
        this.person.setAge(age);
        return this;
    }

    public PersonBasicInfoBuilder gender(String gender) {
        this.person.setGender(gender);
        return this;
    }
}
