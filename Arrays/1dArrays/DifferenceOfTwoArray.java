import java.util.*;
import java.io.*;

public class DifferenceOfTwoArray {
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
        int [] diff = new int[n2>n1 ? n2:n1];

        //find the last indexes 
        int IndexOfArray1 = arr1.length-1;
        int IndexOfArray2 = arr2.length-1;
        int IndexOfdiffArray = diff.length-1;

        int carry = 0;
        //work till the index is positive for the diff array 
        while (IndexOfdiffArray>=0) {
           int digit = arr2[IndexOfArray2] - carry;
           //agr chota number bach rha hai 
            if(IndexOfArray1 >= 0){
                digit = digit -  arr1[IndexOfArray1];
            }
            if(digit < 0){
                digit = digit+10;
                carry=1;
            }else{
                carry=0;
            }
            
            diff[IndexOfdiffArray] = digit;

            IndexOfArray1--;
            IndexOfArray2--;
            IndexOfdiffArray--;
        }
        // Remove the leading zeroes
        int idx = 0;
        while (idx < diff.length) {
            if(diff[idx] !=0){
                break;
            }else{
                idx++;
            }
        }
        //now print the digits of diff array one by one 
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
