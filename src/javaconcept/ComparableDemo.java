package javaconcept;

import java.util.ArrayList;
import java.util.Collections;

 class Student implements Comparable<Student> {

	String name;
	int age;
	int rollNum;

	Student(String name, int age, int rollNum) {
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
	}

	public int compareTo(Student c) {
		if (c.rollNum == rollNum) {
			return 0;
		} else if (c.rollNum > rollNum) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "-" + age + "-" + rollNum;
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Pragati", 18, 1));
		students.add(new Student("Rohit", 19, 2));
		students.add(new Student("Christoffer", 28, 3));

		Collections.sort(students);

		students.stream().forEach(s -> System.out.println(s));

	}
}
