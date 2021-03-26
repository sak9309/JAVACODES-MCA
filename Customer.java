//Implement the concept of inheritance in java.
import java.util.Scanner;

interface BANK
{
    public void createAccount();
    public void deposit();
    public void withdrawal();
    public void getBalance();
}

class SIB implements BANK
{
    //static String Bankid;
    //static String Branch;
    //static String Location;
    //static String IFSC;
    //System.out.println("Bank_Details::\nBankID:SIB006\nBranch:BLR\nLocation:Karnataka\nIFSC:IA009F");
    static String name=" ";
    static String phnum=" ";
    String address;
    int amount;
    int amount1;
    int B;
    public void createAccount()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----------------- Create_New_Account ---------------");
        System.out.println("Enter Account Holder Name :");
        name=s.nextLine();
        System.out.println("Enter Phone Number :");
        phnum=s.next();
        System.out.println("Enter Address:");
        address=s.next();
        System.out.println("--------------------------------------------------------------");
    }
    public void deposit()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----------------- Deposit ---------------");
        
        System.out.println("Enter Amount :");
        amount=s.nextInt();
        
        System.out.println("--------------------------------------------------------------");
    }
   public void withdrawal()
  { 
      Scanner s=new Scanner(System.in);
      System.out.println("----------------- Withdrawal ---------------");
      System.out.println("Enter the withdrawal amount:");
      amount1=s.nextInt();
    }
  public void getBalance()
  {
      if(amount>amount1)
      { 
         B=(amount-amount1);
         System.out.println("Amount left after withdrawal: "+B);
       }
     else
       {
         System.out.println("Please try again..........Error in the recent transaction!!");
       }
  }
}
class Customer extends SIB
{
    public static void main(String args[])
    {
        SIB sib=new SIB();
        sib.createAccount();
        sib.deposit();
        sib.withdrawal();
        String CustomerID;
        String CustomerName;
        String AccountNum;
        String TypeOfAccount;
        String PhNum;
         Scanner s=new Scanner(System.in);
        System.out.println("Enter Customer_Details:\n ");
        System.out.println("Enter CustomerID:");
        CustomerID=s.nextLine();
        System.out.println("Enter Name: ");
        CustomerName= s.nextLine();
        
        if(CustomerName.equals(name))
       {
          //System.out.println("");
          System.out.println("Enter type of Account: Current or Saving!");
          TypeOfAccount=s.next();
          System.out.println("Enter PhoneNumber: ");
          PhNum= s.next();
          if(PhNum.equals(phnum)){
            System.out.println("Account_Details:");
            
            sib.getBalance();
        }
       }
        else
           {
             System.out.println("1) Please Enter Correct Details! \n2)Please Create an Account First!");
       
        
    }
  }
}



