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
    void display(Passenger ps[])
    {
        for(int i=0;i<ps.length;i++)
        {
            if(ps[i].reservation_type=="Confirmed" || ps[i].reservation_type=="confirmed")
            {
                System.out.println("Passenger Name :"+ps[i].name);
                System.out.println("City :"+ps[i].city);
                System.out.println("Reservation Status :"+ps[i].reservation_type);
            }
        }

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
        p[0].display(p);
    }
}