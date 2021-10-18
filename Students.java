package Assignment.week3day1;


public class Students {
public void getStudentInfo(int id,String name, String email, double phnumber) {
	System.out.println("Student1 id : "+id);
	System.out.println("Student1 name: "+name);
	System.out.println("Student1 email: "+email);
	System.out.println("Student1 phone number: "+phnumber);
}
public void getStudentInfo(int id,String name, double phnumber, String email ) {
	System.out.println("Student2 id : "+id);
	System.out.println("Student2 name: "+name);
	System.out.println("Student2 email: "+email);
	System.out.println("Student2 phone number: "+phnumber);
}	
public void getStudentInfo(String name, double phnumber, String email) {
	//System.out.println("Student3 id : "+id);
	System.out.println("Student3 name: "+name);
	System.out.println("Student3 email: "+email);
	System.out.println("Student3 phone number: "+phnumber);
}	
public void getStudentInfo(double phnumber,String name,String email,double id ) {
	System.out.println("Student4 id : "+id);
	System.out.println("Student4 name: "+name);
	System.out.println("Student4 email: "+email);
	System.out.println("Student4 phone number: "+phnumber);
}	
public void getStudentInfo(String email,double phnumber,char name, int id) {
	System.out.println("Student5 id not specified: ");
	System.out.println("Student5 name: "+name);
	System.out.println("Student5 email: "+email);
	System.out.println("Student5 phone number: "+phnumber);
}		
	
	public static void main(String[] args) {
		Students s= new Students(); 
		s.getStudentInfo(12345, "Ball", "none", 11);
		s.getStudentInfo("email1", 256345, 'D', 99);
			
		}

	}


