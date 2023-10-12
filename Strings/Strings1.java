package mypack;
import java.util.*;
public class Strings1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("tony");
		System.out.println(sb);
		
		//char at index 0
		System.out.println(sb.charAt(0));
		
		
		//set char at index 0
		// this basically used to change the character of the string
		sb.setCharAt(0,'p');
		System.out.println(sb);
		
		//insert
		//insert is used it insert character in string
		sb.insert(2, 'n');
		System.out.println(sb);
		
		//delete the extra 'n'
		//this is basically used to delete the character from the string
		//always we have to provide start index and end index
		sb.delete(2, 3);
		System.out.println(sb);
		
		//append
		//The append() method is used to add characters 
		//or other data types to the end of the StringBuilder object.
		StringBuilder st = new StringBuilder("h");
		st.append("e");
		st.append("l");
		st.append("l");
		st.append("o");
		System.out.println(st.length());
		
	}
}
