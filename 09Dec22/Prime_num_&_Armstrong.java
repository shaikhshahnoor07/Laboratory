/* write a program to to print a prime number 1 to 1000 and performance a program to check Armstrong from taking a user input
*/


 public  abstract class primenum { // class for prime number code
   
	int num,i;
public void prime() {
	for(num=1;num<=1000;num++) { // loop fo 1 to 1000
	
		for(i=2;i<1000;i++) { // division
			if(num%i==0) {  
				break;
			}
		}
		if(i==num) { // num and division value same  it will print if statement
	System.out.print(num);	
		}	
	}
}

}
-------

public interface arm { // interface for abstract class 
    public void arms();
}

-------



import java.util.Scanner;


public class armstrong extends primenum implements arm  { // inheriting class and implementing interface
   
    Scanner sc =new  Scanner(System.in); //for user input
    public static void main(String []args) {
        armstrong obj=new armstrong(); //object creation
       obj.call(); //call the fuction
    }

    public void call(){ //creating a function where both fuction place
        prime();
        arms();
    }
    public void arms(){ // creating a function to perform an amstrong num
        System.out.println("Enter your 3 digit numbre");
        int n=sc.nextInt();
              int temp=n;

               int sum=0;
         while(n>0){
        
        int r=n%10;   // seperating the 3 digit 
        
        sum=sum+r*r*r;  //storeing the sum of all 3 digit 
        n=n/10;
         }
         
         if(sum==temp){  // sum and temp mean which value user inter ealier is equal then it fill print
            System.out.println("This is an armstrong number");
         }
         else{
            System.out.println("This is not an armstrong");
         }
        
        }


        
    
}
