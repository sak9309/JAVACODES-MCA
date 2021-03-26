import java.util.Scanner;
import java.lang.Math;
class McaBookRepo{
  static String bookname=" ";
  static double bookid=0;
  static String category=" ";
  static String yearofpublishing=" ";
  static String bookidR=" ";
  static String booknameR=" ";
  //This is a Static Method
  static void disp(){
      System.out.println("_____________________________________________________________");
     System.out.println("Default Values::"); 
     System.out.println("Book Name: CS");
      System.out.println("Category: Theory");
     System.out.println("Year of Publishing: 2020");
     System.out.println("_____________________________________________________________");
  }
  // This is also a static method
  public static void main(String args[]) 
  {
	  Scanner S=new Scanner(System.in);
                  System.out.println("Enter Book:"+bookname);
                  bookname=S.next();
                  double rand=Math.random();
                  bookid=rand;
                  System.out.println("Bookid: "+bookid);
                  System.out.println("Enter Category:"+category);
                  category=S.next(); 
                 System.out.println("Enter Year of publishing:"+yearofpublishing);
                  yearofpublishing=S.next();
                  System.out.println("_____________________________________________________________");
                  System.out.println("Enter the book to be searched::");
                  Scanner R=new Scanner(System.in);
                  disp();
                   System.out.println("Enter Book Name:"+booknameR);
                  
                  booknameR=R.next();
                  
                  if(booknameR.equals(bookname)){
                  
                  String BN=bookname.toUpperCase();
                   System.out.println("_____________________________________________________________"); 
                  System.out.println("Book Name::"+BN);
                  System.out.println("Bookid:: "+bookid);
                  System.out.println("Category:: "+category);
                  System.out.println("Year of Publishing::"+yearofpublishing); 
                 }
                else
                  { 
                    System.out.println("Search should match!\nEnter correct Book Name______!!");
                  }
                  
  }
}

