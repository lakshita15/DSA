//e digits;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int divident = scn.nextInt();
     int divisor =  scn.nextInt();
     int n1 = divisor;
     int n2 = divident;
     while (divisor!=0) {
         int rem = divident%divisor;
         divident=divisor;
         divisor=rem;
     }
     System.out.println(divident);
     //lcm
     int lcm = (n1 * n2) /  divident;
     System.out.println(lcm);
    }    
}
