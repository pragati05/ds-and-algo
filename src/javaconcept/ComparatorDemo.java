package javaconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee  {

	String name;
	int age;
	int rollNum;

	Employee(String name, int age, int rollNum) {
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "-" + age + "-" + rollNum;
	}
}

class NameComparator implements Comparator<Employee>{
	public int compare(Employee s1 , Employee s2) {
		return s1.name.compareTo(s2.name);
		
	}
}
class AgeComparator implements Comparator<Employee>{
	public int compare(Employee s1 , Employee s2) {
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
		
	}
}

class RollNumberComparator implements Comparator<Employee>{
	public int compare(Employee s1 , Employee s2) {
		if (s1.rollNum == s2.rollNum) {
			return 0;
		} else if (s1.rollNum > s2.rollNum) {
			return 1;
		} else {
			return -1;
		}
		
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();

		employee.add(new Employee("Pragati", 18, 1));
		employee.add(new Employee("Rohit", 19, 2));
		employee.add(new Employee("Christoffer", 28, 3));
		
		
		System.out.println("\n *** Age Sort  ** ");
		Collections.sort(employee, new AgeComparator());
		employee.stream().forEach(s -> System.out.println(s));
		
		
		System.out.println("\n *** RollNum Sort  ** ");
		Collections.sort(employee, new RollNumberComparator());
		employee.stream().forEach(s -> System.out.println(s));
		
		
		System.out.println("\n *** Name Sort  ** ");
		Collections.sort(employee, new NameComparator());
		employee.stream().forEach(s -> System.out.println(s));

	}
	
}

