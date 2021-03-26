
import MyPackage.Compare.*;
 
public class DemoNew{
    public static void main(String args[]) {
        int m=10000, n=10000;
        MyPackage.Compare current = new MyPackage.Compare(n, m);
        if(n != m) {
             current.getmax();
        }
        else {
            System.out.println(" The cost of both the Hotels in Jaipur are same!");
        }   
}
}