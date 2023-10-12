//we are reversing the string using StringBuilder
package mypack;

public class Strings2 {
	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("HELLO");
		for(int i=0; i < st.length()/2; i++) {
			
			int front = i;
			int back = st.length() -1 -i;
			
			char frontChar = st.charAt(front);
			char backChar = st.charAt(back);
			
			
			//setCharAt is basically u're setting the char at another place
			st.setCharAt(front, backChar);
			st.setCharAt(back, frontChar);
			
		}
		
		System.out.println(st);
	}

}
