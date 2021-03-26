import java.util.Scanner;
class LoginCreds{
  static String Username=" ";
  static String Password=" ";
  static String UsernameR=" ";
  static String PasswordR=" ";
  //This is a Static Method
  static void disp(){
      System.out.println("UserName: "+Username);
      System.out.println("Password: "+Password);
  }
  // This is also a static method
  public static void main(String args[]) 
  {
	  Scanner S=new Scanner(System.in);
                  System.out.println("Enter Username:"+Username);
                  Username=S.next();
                  System.out.println("Enter Password:"+Password);
                  Password=S.next(); 
                  disp();
                  System.out.println("Enter your Login creds:");
                  Scanner R=new Scanner(System.in);
                  
                   System.out.println("Enter Username:"+UsernameR);
                  UsernameR=R.next();
                  System.out.println("Enter Password:"+PasswordR);
                  PasswordR=R.next(); 
                 
                  if((UsernameR.equals(Username))&&(PasswordR.equals(Password))){
                  disp();
                  System.out.println("LoginSuccessful!");
                 }
                else
                  { 
                    System.out.println("Credentials should match!\nEnter correct Username and Password to Login!!");
                  }
                  
  }
}





