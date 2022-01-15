import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
    
        int d = getDifference(b, number1, number2);
        System.out.println(d);
     }
    
     public static int getDifference(int b, int number1, int number2){
         int res = 0;
  
          int carry = 0;
          int tenkipower = 1;
          while(number2 > 0){
              int digt1 = number1 % 10;
              number1 = number1 / 10;
              int d2 = number2 % 10;
  
              number2 = number2 / 10;
  
              int d = d2 - carry - digt1;
              if(d < 0){
                  carry = 1;
                  d = d + b;
              } else {
                  carry = 0;
              }
  
              res = res + d * tenkipower;
              tenkipower = tenkipower * 10;
          }
  
         return res;
    }
}