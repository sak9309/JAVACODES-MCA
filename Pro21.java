//Implement the concept of inheritance in java.
import java.util.Scanner;

interface Plane
{
    public void flit_reservation();
}
interface Railway
{
    public void rail_reservation();
}
class Passenger implements Plane,Railway
{
    String name;
    String city;
    String reservation_type;
   //this.reservation_type = reservation_type.toUpperCase();

    public void flit_reservation()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----------------- PLANE RESERVATION ---------------");
        System.out.println("Enter Name :");
        name=s.nextLine();
        System.out.println("Enter City :");
        city=s.next();
        System.out.println("Enter Reservation Type(Confirmed/Waiting) :");
        reservation_type=s.next();
        System.out.println("--------------------------------------------------------------");
    }
    public void rail_reservation()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----------------- RAIL RESERVATION ---------------");
        System.out.println("Enter Name :");
        name=s.nextLine();
        System.out.println("Enter City :");
        city=s.next();
        System.out.println("Enter Reservation Type(Confirmed/Waiting) :");
        reservation_type=s.next();
        System.out.println("--------------------------------------------------------------");
    }
    
}
class Pro21
{
    public static void main(String args[])
    {
        Passenger p[]=new Passenger[2];
        for(int i=0;i<p.length;i++)
        {
            p[i]=new Passenger();
        }
        for(int i=0;i<p.length;i++)
        {
            p[i].flit_reservation();
            p[i].rail_reservation();
            
        }
        
    }
}



