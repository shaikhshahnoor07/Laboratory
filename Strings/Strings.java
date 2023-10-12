
package mypack;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		//concatenation
		String firstName = "shaikh";
		String LastName = "Shahnoor";
		String FullName = firstName +"@"+ LastName;
		System.out.println(FullName);
		
		//Length
		System.out.println(FullName.length());
		
		//charAt
		for(int i = 0; i < FullName.length();i++) {
			System.out.println(FullName.charAt(i));
		}
		
		//compare
		//for comparing string we can't use == operator
		//we have to use .compareTo() method
		String name1 = "tony";
		String name2 = "tony";
		if(name1.compareTo(name2)== 0) {
			System.out.println("String are equal");
		}	else {
				System.out.println("String are not equal");
			}
		
		//substring
		//basically it is used to get the string from the middle of the line present in side if String
		//substring(beg index,end index)
		//in line 36 we are giving the starting index 11  and for last index we are using .length() for last index of sentence
		String sentence = "my name is shahnoor";
		String name = sentence.substring(11,sentence.length());//we are putting the substring in variable name
		System.out.println(name);
	}

}
