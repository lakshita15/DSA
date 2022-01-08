package digits;

import java.util.Scanner;

public class Inversenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int place =1;
        int inverse =0;
        while(n!=0){
            int rem = n%10;
            int quot = n/10;

            n=quot;
            inverse= inverse+ place*(int)Math.pow(10, rem-1);
            place++;

        }
        System.out.println(inverse);
    }
}
