
package Generics;

/**
 *
 * @author guexa
 */

//------------------------------Excercise 2-----------------------------------//

//In this exercise you'll see how to use vararg method to pass items

public class Excercise3 {
    
    public static void main(String[] args) 
    {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
        
        printShoppingList(item1, item2);
        printShoppingList2(item1, item2, item3);
        printShoppingList3(shopping);
    }
    
    private static void printShoppingList(String chain1, String chain2)
    {
        System.out.println("SHOPPING LIST :3");
        System.out.println("1. " + chain1);
        System.out.println("2. " + chain2);
        
        System.out.println();
    }
    
    private static void printShoppingList2(String chain1, String chain2, String chain3)
    {
        System.out.println("SHOPPING LIST :3");
        System.out.println("1. " + chain1);
        System.out.println("2. " + chain2);
        System.out.println("3. " + chain3);
        
        System.out.println();
    }
    
    private static void printShoppingList3(String[] items)
    {
        System.out.println("SHOPPING GENERIC LIST :3");
        for(int i = 0; i < items.length; i++)
        {
            System.out.println(i + 1 + ": " + items[i]);
        }
        
        System.out.println();
    }
}
