//{ Driver Code Starts

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution{
public long prime_Sum(int high){
// code here
long sum =0;
    for (int n = 1; n <= high; n++) {
          int count = 0;
          for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {

              count++;
              break;
            }
          }
          if (count == 0 && n != 1 && n !=0 ) {
           sum+=n;
          }
        }
return sum;
    }
}
