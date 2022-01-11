import java.util.Scanner;

public class AnyBaseAddition {
    
  
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
        
            int d = getSum(b, n1, n2);
            System.out.println(d);
         }
        
         public static int getSum(int b, int n1, int n2){
             // write ur code here
             int carry = 0;
             int tenkipower = 1;
             int sum=0;
             while (n1>0|| n2>0 || carry>0) {
                 int dig1 = n1%10;
                 n1=n1/10;
                 int dig2= n2%10;
                 n2=n2/10;
                 int digit = dig1+dig2+carry;
                 carry=digit/b;
                 digit=digit%b;
                sum=sum+digit*tenkipower;
                tenkipower=tenkipower*10;
             }
             return sum;
         }
        
}
