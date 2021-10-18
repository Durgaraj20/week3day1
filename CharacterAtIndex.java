package Assignment.week3day1;

public class CharacterAtIndex {

	public static void main(String[] args) {
String text="Java Exercise";
System.out.println(text.charAt(5));
int indexof1= text.indexOf('E');
int indexof2=text.indexOf('s');
int lastindexof=text.lastIndexOf('e');
System.out.println("Last index of" + lastindexof);
System.out.println("The index of E is :"+ indexof1);
System.out.println("The index of s is :"+ indexof2);
char[] charArray= text.toCharArray();
for(int i=0; i<charArray.length; i++)
{
	System.out.println("CharArray["+i+"]:" + charArray[i]);
}
String replace=text.replace('E', 'e');
System.out.println("The text is: "+ replace);
	


	}

}
