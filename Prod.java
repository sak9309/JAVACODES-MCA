import java.io.*; 
import java.util.Date;
import java.util.Scanner;
class Prod{ 
	public static void main(String[] args) 
	{ 
                                 String Name;
                                 String Product;
                                 String phone;
                                 
                                 		
                           
                                Scanner s=new Scanner(System.in);
                                System.out.println("Enter Employee Name:\n");
                                Name=s.nextLine();
		int p = Name.length(); 

		System.out.println("Length of String=" + p); 
		System.out.println("Enter phone number: ");
                                phone=s.next();
                                    int  Ph= phone.length();
                                    if (Ph != 10) {
		System.out.println("Invalid Phone no. Default number 0000000000 will be placed");
		 phone = "0000000000";
					}
                               System.out.println("Enter your name of the product manufactured:\n");
                               Product=s.nextLine();
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
                             System.out.println("A total of " + argument+" items were manufactured today!!");
                             }
	} 
}