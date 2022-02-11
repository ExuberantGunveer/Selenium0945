package SeleniumPractices;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

public class Arrrray {
	int a[] = new int[3];
	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
     ArrayList ar =new ArrayList();
     ar.add(23);
     ar.add("Hello");
     ar.add(22.05);
     ar.add(true);
     
     System.out.println(ar.size());
     System.out.println(ar.get(1));
     System.out.println(ar.get(2));
     for(int i=0;i<ar.size();i++) {
    	 System.out.println("Output  : " + ar.get(i));
     }
     
     ArrayList<Integer> ar1 = new ArrayList<Integer>();
     ar.add(10);
     ar.add(85);
     
     ArrayList<E> ar2 = new ArrayList<E>();
     Employee e1 = new Employee("Gunveer Singh", 30 ,"QA");
     Employee e2 = new Employee("Saurav Sharma", 27, "QA");
     Employee e3 = new Employee("Rishav", 24, "QA");
     
     ArrayList<Employee> ar4 = new ArrayList<Employee>();
     ar4.add(e1);
     ar4.add(e2);
     ar4.add(e3);
     
     
                                                                                         
     
     
	}

}
