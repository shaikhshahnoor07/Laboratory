/*Q4) Write a program to accept P, R and no of years FROM USER AND calculate SI
*/

import java.util.Scanner;       //importing Scanner Class
public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
    float P, R,  T,  SI; // principal amount, rate, time and simple interest respectively  
    System.out.println("Enter the Principal Amount : ");
        P = sc.nextFloat();
    System.out.println("rate Of Intrest : ");
        R = sc.nextFloat();
    System.out.println("Enter the time (year) : ");
        T = sc.nextFloat();
                                //below we are calculating simple intrest
        SI  = (P*R*T)/100;   
                                //below we are printing Simple intrest
    System.out.println("Simple Interest is: " +SI);  
    }
}  
