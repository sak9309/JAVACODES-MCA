import Classes.Airline.*;
public class AirlineTest {

    public static void main(String[] args) {
        
        
        Classes.Airline airline1 = new Classes.Airline("UA","American Airlines");
        System.out.println("\n"+airline1);
        
        
        airline1.setAirlineID("UA");
        airline1.setAirlineName("American Airlines");
        
        System.out.println(airline1);
        
        
        Classes.Airline airline2 = new Classes.Airline("MA", "Malasia Airlines");
        System.out.println("\n"+airline2);
        
        
        System.out.println(airline2.getAirlineID());
        System.out.println(airline2.getAirlineName());
    }
    
}