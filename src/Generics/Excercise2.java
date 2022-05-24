
package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guexa
 */

//------------------------------Excercise 2-----------------------------------//

//In this excercise you'll see how to convert a method into a generic method and its function

public class Excercise2 
    {
    
    static Character[] charArray = {'h', 'e', '1', '1', 'o'};
    static Integer[] intArray = {1, 2, 3, 4 ,5};
    static Boolean[] boolArray = {true, false, true};
    
//  The standard for create a new type variable is "T" wich switch the array to list method a generic method 
    public static <T> List <T> arrayToList(T[] array, List<T> list)
    {
        for(T object : array)
        {
            list.add(object);
        }
        return list;
    }
    
    public static void main(String[] args) 
    {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        
        System.out.println(charList.get(2));
    }
    
}
