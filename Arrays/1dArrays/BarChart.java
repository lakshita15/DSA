import java.io.*;
import java.util.*;


public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        //find max
        int max = arr[0];
        for (int i = 1; i < n; i++){
          if (arr[i]  > max){
            max = arr[i];
          }
        }
        // get max height
        for (int height = max;  height>=1 ; height--) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= height) {
                  System.out.print("*	");
                }else{
                  System.out.print("	");
                }
            }

            System.out.println();
        }
    }
}
