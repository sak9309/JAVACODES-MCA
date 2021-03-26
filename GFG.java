import java.io.*; 
import java.util.Scanner;
class PassengerDetails{ 
	public static void main(String[] args) 
	{ 
                                 String S;		
                           
                                Scanner s=new Scanner(System.in);
                                System.out.println("Enter a String:\n");
                                S=s.nextLine();
		int p = S.length(); 
		//int q = S.capacity();
		System.out.println("Length of String=" + p); 
		//System.out.println("Capacity of string=" + q); 
                               StringBuffer sb=new StringBuffer("Hello ");  
                               sb.append("Java");//now original string is changed  
                               System.out.println(sb);
                              // loop through all arguments
                               for(String str: args) {
                               // convert into integer type
                              int argument = Integer.parseInt(str);
                             System.out.println("Number of Passengers are:" + argument);
	} 
} 
