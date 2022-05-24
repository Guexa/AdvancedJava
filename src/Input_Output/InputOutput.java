
package Input_Output;

import java.util.Scanner;

/**
 *
 * @author guexa
 */
public class InputOutput {

    public static void main(String[] args) {
        
        String name = "";
        int age = 0;
        Long phoneNumber;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = scan.next();
        
        System.out.println("Enter the age: ");
        age = scan.nextInt();
        
        System.out.println("Enter the phone number: ");
        phoneNumber = scan.nextLong();
        
        Person person = new Person(name, age, phoneNumber);
    }
    
}