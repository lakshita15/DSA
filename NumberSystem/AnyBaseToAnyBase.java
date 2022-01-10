import java.util.*;
import java.io.*;

public class AnyBaseToAnyBase {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
   int  destBase= scn.nextInt();
   int ans = converfromsbtodb(n ,sourceBase,destBase);
   System.out.println(ans);
} 
   //my fnc
public static int converfromsbtodb(int n , int b1 , int b2) {
int decimal = basetodecimal(n, b1);
int base = decimaltobase(decimal, b2);
return base;
}
   //base to decimal
public static int basetodecimal(int n , int b1) {
    int destinationNumber = 0;
    int tenkipower=1;
    while (n!=0) {
        int rem = n%10;
        n=n/10;
        destinationNumber = destinationNumber + rem*tenkipower;
        tenkipower=tenkipower*b1;
    }
    return destinationNumber;
}
   //decimal to base
   public static int decimaltobase(int n  , int b2) {
    int destinationNumber = 0;
   int tenkipower=1;
   while(n!=0){
       int remainder = n%b2;
       //number small
       n=n/b2;
       destinationNumber = destinationNumber + tenkipower*remainder;
       tenkipower=tenkipower*10;
   }
   return destinationNumber;
}
}
