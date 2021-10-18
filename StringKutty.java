package Assignment.week3day1;

public class StringKutty {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		// if(str3==str4) == compares only references not the values
		if (str3.equals(str4))/* compares the values of the string */
		{
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");
	}

}
