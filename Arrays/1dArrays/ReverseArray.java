import java.util.*;
import java.io.*;

public class ReverseArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        reverse(a);
        display(a);
     }
    
     public static void reverse(int[] arr){
        // write your code here
        int left =0;
        int right = arr.length-1;
        for (left = 0; left < right; left++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
        }
      }
      public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        
        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
    
}
