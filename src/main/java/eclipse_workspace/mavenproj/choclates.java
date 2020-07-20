package eclipse_workspace.mavenproj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class choclates extends App {
   

	public choclates(int weight, int price, String chocname) {
		ar.add(weight);
		hm.put(price,chocname);
	}
	public choclates() {
		// TODO Auto-generated constructor stub
	}
	static int tw = 0;
	public  int totalweight() {
		for(int i= 0;i<ar.size();i++) {
			tw += ar.get(i);
		}
		return tw;
	}
	public  void sortbykey() 
    { 
        TreeMap< Integer,String> sorted = new TreeMap<Integer, String>(); 
        sorted.putAll(hm); 
       /* for (Entry<Integer, String> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue());   */      
    } 
		
}
