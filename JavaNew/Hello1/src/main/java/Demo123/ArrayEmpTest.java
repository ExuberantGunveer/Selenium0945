package Demo123;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEmpTest  {


	public void addData() {
		EmpTest ep = new EmpTest("Gunveer", 30, "QA");
		EmpTest ep1 = new EmpTest("Rishav", 25, "QA");
		EmpTest ep2 = new EmpTest("Saurav", 25, "QA");
		
		ArrayList<EmpTest> ar = new ArrayList<EmpTest>();
		ar.add(ep2);
		ar.add(ep1);
		ar.add(ep);
		
		Iterator<EmpTest> et = ar.iterator();
		while(et.hasNext()) {
			EmpTest st = et.next();
			System.out.println(st.name);
			System.out.println(st.age);
			System.out.println(st.Dept);
		}

		
		
	}

	public static void main(String[] args) {

		ArrayEmpTest jj = new ArrayEmpTest();
		jj.addData();
		
		
		
	}

}
