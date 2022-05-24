
package Input_Output;

/**
 *
 * @author guexa
 */
public class Person {
    
    private String name;
    private int age;
    private long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("\nPerson Created. " + "\nName: " + name + "\nAge: "
                + age + "\nPhone number: " + phoneNumber);
    }
    
}
