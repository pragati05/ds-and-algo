package basic_interview_programs;

import java.util.ArrayDeque;

/**
 * Employee
 * Dept
 * Address
 * 
 * @author pragati
 *
 */
public class agileTest {

	static ArrayDeque<Integer> lru = new  ArrayDeque<Integer>();
	static int size = 0;
	
	
	agileTest(int size){
		
	}
	
	static void addElement(Integer i){
		if(size < 10) {
			lru.add(i);
			size++;
		}else{
			removeElement(i);
			size--;
		}
		
	}
	
	static void removeElement(int i){
		if(!lru.isEmpty()) {
			lru.removeFirst();
			lru.addLast(i);
		}
		else
			System.out.println("Queue is empty");
	}
	
	static void removeElement(){
		if(!lru.isEmpty())
			lru.removeFirst();
		else
			System.out.println("Queue is empty");
	}
	
	static void getElement(int i) {
		if(lru.contains(i)) {
			if(lru.remove(i));
				lru.addLast(i);	
		}else {
			System.out.println("Element not found");
		}
	}
	
	static void printQ() {
		System.out.println(lru);
	}
	public static void main(String[] args) {
		
		addElement(1);
		addElement(2);
		addElement(3);
		addElement(4);
		addElement(5);
		addElement(6);
		addElement(7);
		addElement(8);
		addElement(9);
		addElement(10);
		
		printQ();
		
		
		getElement(1);
		getElement(3);
		printQ();
		
		addElement(11);
//		addElement(12);
//		addElement(13);
//		addElement(14);
		printQ();


	}

}


//
//Employee{
//	
//	emp_id,emp_name,depts,address
//}
//
//
//Dept{
//	dept_id,dept_name
//}
//
//employeeAddress{
//	
//	emp_id -> add_id
//}
//Adress{
//	Address_Id, line1, lien2 ,Country,state, city, address_type
//}
//
//list empy ,addre type = communication , city = mum
//
//select * from employee  e Join on Address a 
//
//
//select * from emp where empId in (select empID from employeeAddress  e join Address a on  
//		e.add_id = a.addId  where a.add_type ='communcation' and a.city ='mumbai') as emp;
//
//
//
//
//queue -  10
//
//
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//
//
//
//Class 




