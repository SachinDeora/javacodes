import java.util.*;

public class InverseNumber{

public static void main(String[] args) {
  Scanner s1=new Scanner(System.in);
  int n=s1.nextInt();
   int inv=0;
   int op=1;//original position
   while(n>0)
   {
     int od=n%10;
     int id=op;
     int ip=od;
     //Make change to inversing.
     inv=inv+id*(int)Math.pow(10,ip-1);
     n=n/10;
     op++;
   }
   System.out.println(inv);
 }
}