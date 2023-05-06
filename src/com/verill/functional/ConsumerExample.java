package com.verill.functional;

import java.util.List;
import java.util.function.Consumer;

import com.verill.data.Student;
import com.verill.data.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> c1 = p -> System.out.println(p);
	static Consumer<Student> c2 = p -> System.out.println(p.getName().toUpperCase());
	static Consumer<Student> c3 = p -> System.out.println(p.getGpa());
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		//To print Name and Grade
		studentList.forEach(c2.andThen(c3));
		//studentList.forEach(c2);
		printUsingCondition();
		
		Consumer<String> c4 = s -> System.out.println(s.toLowerCase());
		c4.accept("PADMA");
	}

	public static void printUsingCondition() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Using Condition>>>");
		studentList.forEach(s -> {
			if(s.getGradeLevel()>3) {
				c2.andThen(c3).accept(s);
			}
		});
	}
}
