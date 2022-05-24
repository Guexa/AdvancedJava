
package AdvanceDataStructures;

import java.util.LinkedList;

/**
 *
 * @author guexa
 */
public class LinkedListE {
    
    public static void main(String[] args) {
        
        LinkedList <String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        
        System.out.println(myList);
        myList.remove("A");
        myList.remove("B");
        myList.remove("C");
        
        System.out.println("Empty list: " + myList);
    }
    
}
