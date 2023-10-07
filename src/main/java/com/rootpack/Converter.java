package com.rootpack;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Converter {

	public static void main(String[] args) throws Exception {
		java_to_json();
		json_to_java();

	}
	
	public static void json_to_java() throws Exception{
		File f=new File("student.json");
		ObjectMapper mapper = new ObjectMapper();
		Student[] student = mapper.readValue(f,Student[].class);
		for (Student student2 : student) {
			System.out.println(student2);
		}
		
	}
	public static void java_to_json() throws Exception {
		ArrayList<Student> slist = new ArrayList<>();
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("dorababu");
		s1.setStudentRank(10);

		s2.setStudentId(102);
		s2.setStudentName("veerababu");
		s2.setStudentRank(20);

		slist.add(s1);
		slist.add(s2);

		/*
		 * Students students=new Students(); students.setSlist(slist);
		 */

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(slist);
		System.out.println(json);

	}

}
