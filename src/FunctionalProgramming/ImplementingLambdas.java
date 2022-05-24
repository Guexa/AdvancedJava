
package FunctionalProgramming;

/**
 *
 * @author guexa
 */
public class ImplementingLambdas {

    public static void main(String[] args) {
        
        GreetingMessage gm = new GreetingMessage()
        {
            @Override
            public void greet(String name)
            {
                System.out.println("Hello " + name);
            }
        };
        
        gm.greet("Alexita");
        
        GreetingMessage gm2 = (String name) ->
        {
            System.out.println("Hello " + name);
        };
        
        gm.greet("Alexita");
        
        MessagePrinter mp = () -> 
        {
            System.out.println("This is a message");
        };
        mp.printMessage();
    }
}
    

