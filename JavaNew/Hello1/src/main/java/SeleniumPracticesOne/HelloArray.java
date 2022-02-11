package SeleniumPracticesOne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HelloArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(50);
		ar.add(60);
		ar.add(100);
		System.out.println(ar);
		System.out.println(ar.get(1));
		ArrayList ar1 = new ArrayList();
		ar1.add("Gunveer Singh");
		ar1.add(19.54);
		ar1.add(954);
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Stupid");
		ar2.add("Idiot");
		
		String namem = "You are Stupid";
		// ar2.contains("You are Stupid".replaceAll("Stupid", "******"));
		System.out.println(ar2.contains(namem.replace(ar2.get(1),"*****")));
		System.out.println();

				
		
		ar.addAll(ar1);
		System.out.println(ar);
		
		String entry = "Your are Soo Stupid";
		String entry1 = "Your are Bastard";
		
		
		String newentry = entry.replace("Stupid", "*****");
		String newentry1 = entry1.replace("Bastard", "*****");
		
		
		System.out.println(newentry);
		System.out.println(newentry1);
		
		System.out.println("************************");
		System.out.println();
		
		List<String> names = new LinkedList<String>();
        names.add("Welcome");
        names.add("To");
        names.add("G");
  
        // Getting ListIterator
        ListIterator<String> namesIterator= names.listIterator();
  
        // Traversing elements
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
        System.out.println();
        System.out.println("************************");
        System.out.println();
        while(namesIterator.hasPrevious()) {
        	System.out.println(namesIterator.previous());
        	
        	
        	
        }
  
				
				

	}

}
