import java.util.Scanner;
class MyException extends Exception
{
  private int val;
  MyException(int a)
  {
    val = a;
  }
  public String toString()
  {
    return "MyException[" + val +"] is less than zero";
  }
}

class UDExcep
{
  static void sum(int a,int b) throws MyException//a and b are formal arguements
  {
   
    if(a<0)
    {
      throw new MyException(a); //calling constructor of user-defined exception class
     
    
    }
    else
    {
      System.out.println(a+b);
    }
  }

  public static void main(String[] args)
  {
int A;
int B;
Scanner s=new Scanner(System.in);//Scanner class objec for user input
System.out.println("Enter the Range Lower Limit: ");
A=s.nextInt();//Integer type value by user
System.out.println("Enter the Range Upper Limit: ");
B=s.nextInt();//Integer type value by user

 
  try
    {
      sum(A,B);//A and B are actual arguements
    }
    catch(MyException me)
    {
      System.out.println(me); //it calls the toString() method of user-defined Exception
    }
  }
}