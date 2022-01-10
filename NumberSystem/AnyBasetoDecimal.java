import java.util.Scanner;
import java.util.*;

public class AnyBasetoDecimal {
     public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
    int destinationNumber = 0;
   int tenkipower=1;
   while(n!=0){
       int remainder = n%10;
       //number small
       n=n/10;
       destinationNumber = destinationNumber + tenkipower*remainder;
       tenkipower=tenkipower*b;
   }
   return destinationNumber;
   }
}
