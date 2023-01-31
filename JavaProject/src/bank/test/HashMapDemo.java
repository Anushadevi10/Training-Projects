package bank.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;



public class HashMapDemo {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        HashMap<String, String> Cities = new HashMap<String, String>();
        
        Cities.put("India", "New Delhi");
        Cities.put("Germany", "Berlin");
        Cities.put("Australia", "Canberra");
        Cities.put("Norway", "Oslo");
        System.out.println(Cities);
        System.out.println(Cities.get("Norway"));
        
        //Printing key and value pair using iterator
        Iterator<Entry <String, String> > itr = Cities.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        
        //Printing key and value pair using for each
        
        
    }
}
