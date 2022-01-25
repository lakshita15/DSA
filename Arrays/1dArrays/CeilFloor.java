
import java.util.*;
import java.io.*;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt ();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
          arr[i] = scn.nextInt ();
        }
        // enter data to be searched
        int data = scn.nextInt ();
        //enter pointers
      ceilfloor(arr , data);


    }
    public static void ceilfloor(int arr [] , int data) {
        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;
        int floor = -1;
        while (left <= right)
        {
          int mid = (left + right) / 2;
          if (data < arr[mid])
          {
              ceil = arr[mid];
            right = mid - 1;
          }
          else if (data > arr[mid])
          {
            floor = arr[mid];
            left = mid + 1;
          }
          else
          {
            ceil = data; // potential answer
            floor=data;
            break;
          }
        }
      
        System.out.println (floor);
        System.out.println (ceil);
    }
}
