package digits;

import java.util.Scanner;

public class Rotatenumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k =  scn.nextInt();
        int num = n;
        int nod =0;

        while(num!=0){
            num=num/10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k=k+nod;
        }
        int div = (int)Math.pow(10, k);
        int mul = (int)Math.pow(10,  nod - k);
        int q = n/div;
        int r = n%div;
        int ans = (r*mul)+q;
        System.out.println(ans);
    }
}
