public class Operators {

	public static void main(String[] args) {
	//Unary Operator Post
		int a=10;  
		int b=10; 
		int c=20;
		int d=5;
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		
		
		//Unary Operator Pre 
		boolean e=true;  
		boolean f=false;  
		System.out.println(~a);  
		System.out.println(~b);  
		System.out.println(!e);  
		System.out.println(!f);
		
		
		//Arithmetic Operators
		System.out.println(a+b);  
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);  
		
		
		//Shift Operator
		System.out.println(10<<2);
		System.out.println(10>>2);
		
		//Logical && and Bitwise &
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false 
		System.out.println(a>b||a<c);//true || true = true
		System.out.println(a>b||a++<c);//true || true = true  
		
		
		//Assignment Operator\
		a+=4;
		System.out.println(a);  
		b-=4;
		System.out.println(b);  
		c*=4;
		System.out.println(c);  
		d/=5;
		System.out.println(d);  
		

	}

}
