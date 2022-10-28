/*Q3) Write a program to accept radius from user and calculate Area of circle and circumfrances of circle*/

import java.util.Scanner;       //importing Scanner Class
public class Area_Ciracumferrence_Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius, area, circumference;
                                                      //taking input for the Radius
        System.out.println("Enter Radius of Circle : ");   
        radius = sc.nextDouble();
                                                  // Calculate area and circumference of circle
         area = Math.PI * radius * radius; 
        circumference = 2 * Math.PI * radius;
                                               // Displaying Arean and Circumference of the Circle      
        System.out.println("Area of Circle : " + area);
         System.out.println("Circumference of Circle : " + circumference);
    }
}
