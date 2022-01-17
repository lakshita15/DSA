import java.io.*;
import java.util.*;
public class RotateArray {
     public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){

    k=k%a.length;
    if(k <0 ){
        k=k+a.length;
    }
    // write your code here
    reverse(a , 0 , a.length-1); //full array
    reverse(a , 0 , a.length-k-1); // reverse starting part
    reverse(a ,  a.length-k , a.length-1); // reverse ending part
  }
   public static void reverse(int[] arr , int left ,  int right ){
        for (; left < right; left++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
        }
      }
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
