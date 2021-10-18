package Assignment.week3day1;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		String str3 = new String("I am learning java and selenium");
if(str1==str2){
	System.out.println("The strings are equal in ==");
}
else {
	System.out.println("The strings are not equal==");
}
if(str1.equals(str2)) {
	System.out.println("The strings are equal");
}
else {
	System.out.println("The strings are not equal");
}
if(str1.equalsIgnoreCase(str2)) {
	System.out.println("The strings are equal");
}
else {
	System.out.println("The strings are not equal");
	
}
	System.out.println(str1.contains("Java"));
	System.out.println(str2.contains("java"));
	System.out.println(str3.contains("selenium"));
	
}
	}


