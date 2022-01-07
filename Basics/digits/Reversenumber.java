package digits;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n!=0) {
            int remainder= n %10;
            System.out.println(remainder);
            n=n/10;
    
        }
    }
}
