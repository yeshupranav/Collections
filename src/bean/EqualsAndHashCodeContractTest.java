package bean;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodeContractTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Karthi", "9849643330");
		Employee emp2 = new Employee(1, "abc", "9849643330");
		Employee emp3 = new Employee(2,"ram","8978953520");
		Employee emp4 = new Employee(2,"ram","8978953520");
		Employee emp5 = new Employee(3,"frans","9908595321");
	    System.out.println(emp1.equals(emp2));//false
/*	    //because invoked equals method,that is provided by the object class;
	    //emp1 refers to the different object & emp2 refers to the different object;
 		emp1 has the memory location of the one object;
		emp2 has the memory location of the another object;		
       //equals()checking the 2 objects are equal or not; which respecting to the content;
	  //it only check the 2 objects are refer to the same object or not;it is by default v can't overridden ourself because equals method belongs to Object class;	
*/		Set<Employee> empSet = new HashSet();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
		System.out.println(empSet);
	       //hash code method returns the memory location;
		//returns integer;helps the performance of collections;
	}

}
