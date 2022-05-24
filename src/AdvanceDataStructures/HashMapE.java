
package AdvanceDataStructures;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author guexa
 */
public class HashMapE {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Alexita", 12345);
        phonebook.put("Brenda", 98765);
        
        phonebook.put("Citlalli", 12365);
        phonebook.put("Citlalli", 12135);
        
        if(phonebook.containsKey("Citlalli"))
        {
            phonebook.remove("Citlalli");
        }
        
        System.out.println(phonebook);
        
//        System.out.println("\n List of contacts in phonebook");
//        for(Map.Entry<String, Integer> entry: phonebook.entrySet())
//        {
//            System.out.println(entry.getKey() + ": " entry.getValue());
//        }
        
    }
    
}
