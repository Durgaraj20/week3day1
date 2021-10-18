package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		String name="Durga";
		int id= 23148;
		String dept="Computers";
		System.out.println("My name is :" +name);
		System.out.println("My id is :" +id);
		System.out.println("My department is :" +dept);
		Department d= new Department();
		d.deptName();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
		
	}

}
