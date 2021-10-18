package Assignment.week3day1;

public class StringReplacePrint {

	public static void main(String[] args) {
		String str = "I am working with Java8";
		String str1= "Durgaraj20";
		String replace = str.replace("8", "11");
		System.out.println("Replace strig is: " + replace);
		String replaceall= str1.replaceAll("[\\D]", " ");
		System.out.println("The new String is: " +replaceall);
		String replaceall1= str1.replaceAll("[\\d]", " ");
		System.out.println("The new String is: " +replaceall1);
		char[] chararray= str.toCharArray();
		for(int i=5; i<=14;i++)
		{
			System.out.println("CharAt["+i+"]" + chararray[i]);
		}
	}

}
