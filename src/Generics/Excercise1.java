
package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guexa
 */

//------------------------------Excercise 1-----------------------------------//

//In this excercise you'll see the basic of a generic List

public class Excercise1 {

    public static void main(String[] args) {
        
        //Example without Excercise1
        List names = new ArrayList();
        names.add("Alexa");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
        //names.add(7);
        
        //Example with Excercise1
        List <String> names2 = new ArrayList();
//      Here, when I created the list, I specify in the angled brackets that
//        the list is a list of string (in this case), doing that we don't need
//        to cast the object into a string when you assign it to a variable
        names2.add("Alexita");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        //names2.add(7);
        
        
        
    }
    
}
