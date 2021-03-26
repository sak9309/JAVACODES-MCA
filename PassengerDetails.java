import java.io.*; 
import java.util.Date;
import java.util.Scanner;
class PassengerDetails{ 
	public static void main(String[] args) 
	{ 
                                 String Name;
                                 String Venue;
                                 		
                           
                                Scanner s=new Scanner(System.in);
                                System.out.println("Enter your Name:\n");
                                Name=s.nextLine();
		int p = Name.length(); 
		//int q = Name.capacity();
		System.out.println("Length of String=" + p); 
		//System.out.println("Capacity of string=" + q); 
                               System.out.println("Enter your place of stay:\n");
                               Venue=s.nextLine();
                              //Name=lname.append(fname);
                              
                               
                               StringBuffer sb=new StringBuffer("Passenger_Details:");  
                               sb.append(Name);//now original string is changed  
                               System.out.println( sb);
                                // Instantiate a Date object
                              Date date = new Date();

                              // display time and date
                              String S= String.format("Current Date/Time : %tc", date );

                              System.out.println(S);
                              // loop through all arguments
                               for(String str: args) {
                               // convert into integer type
                              int argument = Integer.parseInt(str);
                             System.out.println("Stay for " + argument+" days!!");
                             }
	} 
} 
