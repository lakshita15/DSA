//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<Integer> ans=ob.nFibonacci(N);
            for(Integer u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList <Integer> nFibonacci(int N){
        //code here
       ArrayList <Integer> list=new ArrayList<>();
       int a=-1;
       int b=1;
       int sum=0;
       while(true){
           sum=a+b;
           if(sum<=N){
               list.add(sum);
           }
           else{
               break;
           }
           a=b;
           b=sum;
       }
       return list;
   }
   }
    
