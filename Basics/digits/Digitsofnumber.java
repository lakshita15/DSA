package digits;
import java.io.*;
import java.util.*;
public class Digitsofnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int digit = 0;

        while (n!=0) {
          n=n/10;
          digit++;
        }
        int div = (int)Math.pow(10, digit-1);
        int q = n/div;
        int r = n%div;
        System.out.println(q);

       n=r;
       div=div/10;
    }
}
