//Lab3: Implementing the concept of control statements and Arrays in the class
//2047262
//In this particular program,an array is used to store username and password and then validated using if (control statement).

import java.util.Scanner;
public class ArrayControl
{ 

	public static void main(String[] args) throws Exception 
	{
    		Scanner s = new Scanner(System.in);
    		String[] array = new String[20];

  		 System.out.println("Please enter your username: ");
   		 array[0] = s.nextLine();
		System.out.println("Please enter your password: ");
   		 array[1] = s.nextLine();  	 	 		
    		
		if(array[0].equals("udit") && array[1].equals("123"))
			System.out.println("Correct! Username & Password");
		else
			System.out.println("incorrect! username");		
		
	}
}