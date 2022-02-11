package Demo123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaCollections {

	public static void main(String[] args) {

		
		ArrayList myList = new ArrayList();
		myList.add("Gunveer");
		myList.add("Singh");
		myList.add(56);
	
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
			
					}
		
		System.out.println("*********************************************");
		
		
		
		ListIterator io = myList.listIterator();
		while(io.hasNext()) {
			System.out.println(io.next());
		}
		
		System.out.println("*********************************************");
		while(io.hasPrevious()) {
			System.out.println(io.previous());
		}
		
	}
}
