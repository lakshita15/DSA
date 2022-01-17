import java.io.*;
import java.util.*;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        int [] sum = new int[n2>n1 ? n2:n1];

        //find the last indexes 
        int IndexOfArray1 = arr1.length-1;
        int IndexOfArray2 = arr2.length-1;
        int IndexOfSumArray = sum.length-1;

        int carry = 0;
        //work till the index is positive for the sum array 
        while (IndexOfSumArray>=0) {
           int digit = carry;
            if(IndexOfArray1 >= 0){
                digit = digit+ arr1[IndexOfArray1];
            }
            if(IndexOfArray2 >= 0){
                digit = digit+ arr2[IndexOfArray2];
            }
            carry = digit/10;
            digit = digit%10;
            sum[IndexOfSumArray] = digit;

            IndexOfArray1--;
            IndexOfArray2--;
            IndexOfSumArray--;
        }
        //carry bach gya to 
        if(carry>0){
            System.out.println(carry);
        }
        //now print the digits of sum array one by one 
        for (int x = 0; x < sum.length; x++) {
            System.out.println(sum[x]);
        }
    }
}
