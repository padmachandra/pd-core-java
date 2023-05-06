package com.verill.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
	
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(111,"padma");
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}

}
