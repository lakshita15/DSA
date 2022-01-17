import java.io.*;
import java.util.*;

public class SpanOfArray {
    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int [] arr = new int[n]; //size of the array will be the number we are going to provide 
       for (int i = 0; i < arr.length; i++) { //loop to traverse on array 
        arr[i] = scn.nextInt();
       }
        // System.out.println(arr[i]+"arr");
        int max = arr[0];
        int min = arr[0];
        for (int j = 1 ; j < arr.length; j++) {
            if(arr[j] > max){
                max=arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
        }
        int span = max-min;
        System.out.println(span);
       
    }
}