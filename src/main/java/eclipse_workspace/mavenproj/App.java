package eclipse_workspace.mavenproj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static ArrayList<Integer> ar = new ArrayList<Integer>(); 
	   public static Map< Integer,String> hm =  
	            new HashMap<Integer, String>(); 

    public static void main( String[] args )
    {
        choclates choc = new choclates(24,100,"milky bar");
        choclates chocos1 = new choclates(14,400,"dairy milk");
		choclates chocos2 = new choclates(12,200,"kit-kat");
		choclates chocos3 = new choclates(32,300,"five star");
		choclates chocos4 = new choclates(42,500,"mars");
		choclates c = new choclates();
		System.out.println("Enter the low and high range of price of choclates");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int h = sc.nextInt();
		System.out.println("The weight of total choclates is "+c.totalweight());
		c.sortbykey();
		hm.forEach((price,choconame) -> {
			if(price>=l && price<=h)
			System.out.println("Key: " + price + ", Value: " + choconame);
		});
    }
}
