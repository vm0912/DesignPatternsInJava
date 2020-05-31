package CreationalDesignPatterns.Builder;

/**
 *A simple demonstration of the fluent Builder design pattern.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .basicInfo()
                    .name("Marija")
                    .age(32)
                    .gender("female")
                .addressInfo()
                    .state("Croatia")
                    .town("Sisak")
                    .zipCode("44000")
                    .streetAddress("Rimska 8")
                .contact()
                    .phoneNumber("(+385)44/573-821")
                    .email("marija.maric@gmail.com")
                .jobInfo()
                    .company("HEP")
                    .position("Electrical engineer")
                    .monthlySalary(10000.00)
                .build();


        System.out.println(person);


    }
}
