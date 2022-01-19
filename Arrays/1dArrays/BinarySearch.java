
import java.util.*;

import javax.xml.crypto.Data;

import java.io.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int data = scn.nextInt();

        int left = 0;
        int right = arr1.length -1;
        
        while (left <= right) {
            int mid = (left+right)/2;

            if(mid==data){
            System.out.println(mid);
            }else if(arr1[mid]<= data){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        System.out.println(-1);
    }
}
