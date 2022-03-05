import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int diag = 0; diag < arr[0].length; diag++) {
            for(int i=0 , j= diag ; j < arr[0].length ; i++,j++){
                System.out.println(arr[i][j]);
            }
        }
        
    }

}
