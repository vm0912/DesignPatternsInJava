package CreationalDesignPatterns.Builder;

 class PersonContactBuilder extends PersonBuilder {

    public PersonContactBuilder(Person person) {
        this.person = person;
    }

    private  String phoneNumber, email;

    public PersonContactBuilder phoneNumber(String phoneNumber){
        this.person.setPhoneNumber(phoneNumber);
        return this;
    }

    public PersonContactBuilder email(String email){
        this.person.setEmail(email);
        return this;
    }
}
