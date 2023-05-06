package com.verill.functional;

import java.util.List;
import java.util.function.BiConsumer;

import com.verill.data.Student;
import com.verill.data.StudentDataBase;

public class BiConsumerExample {
	
	static BiConsumer<String,List<String>> studentAct =  (i,j) -> System.out.println("name: "+i+" and Activities "+j);
	
	public static void main(String[] args) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		//studentAct.accept(stdList., null);
		stdList.forEach(s -> studentAct.accept(s.getName(), s.getActivities()));
	}

}
