package CreationalDesignPatterns.Builder;

 class PersonJobInfoBuilder extends PersonBuilder{

    public PersonJobInfoBuilder(Person person) {
        this.person = person;
    }

    public PersonJobInfoBuilder company(String company){
        this.person.setCompany(company);
        return this;
    }

    public PersonJobInfoBuilder position(String position){
        this.person.setPosition(position);
        return this;
    }

    public PersonJobInfoBuilder monthlySalary(double monthlySalary){
        this.person.setMonthlySalary(monthlySalary);
        return this;
    }
}
