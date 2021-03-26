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
  static void sum(int a,int b) throws MyException
  {
   Scanner s= new Scanner();
   System.out.println("Enter a value of your choice:");
    a=s.nextLine();
    if(a<0)
    {
      throw new MyException(a); //calling constructor of user-defined exception class
     System.out.println("Enter a value under the range of -10 to 10!!");
    
    }
    else
    {
      System.out.println(a+b);
    }
  }

  public static void main(String[] args)
  {
    try
    {
      sum(-10, 10);
    }
    catch(MyException me)
    {
      System.out.println(me); //it calls the toString() method of user-defined Exception
    }
  }
}