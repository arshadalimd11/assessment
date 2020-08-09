package assignment2;

import java.util.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class StudentMain {
	
	Map<String,Student> student=new HashMap<>();
	Set<Student> evenstud=new HashSet<>();
	Set<Student> oddstud=new HashSet<>();
	List<String> list=new ArrayList<>();
	public static void main(String args[]) {
		StudentMain obj=new StudentMain();
		obj.runapp();
	}

	private void runapp() {
		Student student1=new Student("roll1",27);
		student.put("roll1",student1);
		Student student2=new Student("roll2",28);
		student.put("roll2",student2);
		Student student3=new Student("roll3",25);
		student.put("roll3",student3);
		Student student4=new Student("roll4",24);
		student.put("roll4",student4);
		Set<String> keys = student.keySet();
		
		for(String a:keys) {
			Student stud=student.get(a);
			
			if(stud.getage()%2 == 0) {
				evenstud.add(stud);
			} 
			else {
					oddstud.add(stud);
				}
		}
		
		System.out.println("Even number students");
		for(Student student:evenstud) {
		
			System.out.println("roll no is: " +student.getrollno() + " age is "+ student.getage());	
		}
		
		System.out.println("odd number students");
		for(Student student:oddstud) {
	
			System.out.println("roll no is: " +student.getrollno() + " age is "+student.getage());
			}
			
		}
		
	}
	
	

