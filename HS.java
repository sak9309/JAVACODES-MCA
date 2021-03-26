import java.util.Scanner;
class Person1
{
   Person1(String name)
  {
    System.out.println("Name of person = "+name);
  }
  
  Person1(String name, String voterId)
  {
    System.out.println("Name of person = "+name );
    System.out.println("Voter ID of " +name+ " = "+ voterId);
  }
     public String formatNumber(int value) {
        return String.format("%d", value);
    }

    public String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    public String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }
   
      public static void main (String [] args) 
  {
      
       Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Menu driven code::");

		//menu driven template
		while(true){
			System.out.println("To execute Constructor Overloading(Parameterised constructors), Enter value 1!");
			System.out.println("To execute case 2, Enter value 2");
			System.out.println("To Exit, Enter value 9");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();//accept user input

			switch(choice){
			case 1: System.out.println("Contructor overloading-------Parameterised constructors!");
			//method call or logic for case 1
                                               // If user has not voter ID then just print name.
                                                Person1 person1 = new Person1("Ravi");
                                                 // If user has voter ID then print name and voter Id
                                                Person1 person2 = new Person1("Ram", "12345678");
                                                System.out.println("_________________________________________");
			break;
			case 2: System.out.println("Method Overloading");
                                                 //HelperService hs = new HelperService();
                                                 Person1 hs = new Person1();
                                                System.out.println(hs.formatNumber(500));
                                                System.out.println(hs.formatNumber(89.9934));
                                                 System.out.println(hs.formatNumber("550"));
			//method call or logic for case 2

                                              
			break;
			case 9: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");

     
}
}
}
}







