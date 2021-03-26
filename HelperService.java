import java.util.Scanner;
class Person1
{
   Person1()
   {
    System.out.println("This is a default constructor!!");
   }
   Person1(String name)
  {
    System.out.println("Name of person = "+name);
  }
  
  Person1(String name, String voterId)
  {
    System.out.println("Name of person = "+name );
    System.out.println("Voter ID of " +name+ " = "+ voterId);
  }
    
     
}
class HelperService {

    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }
 public static void main (String [] args) 
  {
      
       Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Tours and Travels::");

		//menu driven template
		while(true){
			System.out.println("To execute Constructor Overloading(Parameterised constructors), Enter1!");
			System.out.println("To execute Constructor Overloading(Default constructor), Enter 2!");
                                                System.out.println("To execute Method Overloading, Enter 3!");
			System.out.println("To Exit, Enter 4!");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();//accept user input

			switch(choice){
			case 1: System.out.println("Contructor Overloading-------Parameterised constructors!");
			//method call or logic for case 1
                                               // If user has not voter ID then just print name.
                                                Person1 person1 = new Person1("Claire Peterson");
                                                 // If user has voter ID then print name and voter Id
                                                Person1 person2 = new Person1("Joe Mathew", "12345678");
                                                System.out.println("_________________________________________");
			break;
                                                case 2: System.out.println("Constructor Overloading-------Default constructor!");
                                                //method call or logic for case 2
                                                Person1 person3= new Person1(); 
                                                System.out.println("___________________________________________");

                                                break;
			case 3: System.out.println("Method Overloading");
                                                //method call or logic for case 3
                                                 HelperService HS = new HelperService();
                                                 System.out.println(HS.formatNumber(500));
                                                System.out.println(HS.formatNumber(89.9934));
                                                 System.out.println(HS.formatNumber("550"));
			System.out.println("___________________________________________");


                                              
			break;
			case 4: System.out.println("Exiting the application");
			System.exit(0);
                                        System.out.println("___________________________________________");

			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");


     
}
}
}
 

   
}







