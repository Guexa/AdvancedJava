
package SubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guexa
 */
public class Main {
    
    public static void main(String[] args) 
    {   
        Building building = new Building();
        Office office = new Office();
        
        build(building);
        build(office);
        
        List<Building> buildings = new ArrayList();
        List<Office> offices = new ArrayList();
        buildings.add(new Building());
        offices.add(new Office());
        printBuildings(buildings, offices);
    }
    
    static void build(Building building)
    {
        System.out.println("Constructing a new " + building.toString());
    }
    
    static void build(Office office)
    {
        System.out.println("Constructing a new " + office.toString());
    }
    
    static void printBuildings(List<Building> buildings, List<Office> offices)
    {
        for(int i = 0; i < buildings.size(); i++)
        {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
        
        for(int i = 0; i < offices.size(); i++)
        {
            System.out.println(i + 2 + ": " + offices.get(i).toString());
        }
    }
}
