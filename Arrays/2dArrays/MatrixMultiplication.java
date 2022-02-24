
    import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int matrix1kirows = scn.nextInt();
        int matrix1kecolums = scn.nextInt();
        int[][] one = new int[matrix1kirows][matrix1kecolums];
        for(int i = 0; i < one.length; i++){
            for(int j = 0; j < one[0].length; j++){
                one[i][j] = scn.nextInt();
            }
        }

        int matrix2kirows = scn.nextInt();
        int matrix2kecolums = scn.nextInt();
        int[][] two = new int[matrix2kirows][matrix2kecolums];
        for(int i = 0; i < two.length; i++){
            for(int j = 0; j < two[0].length; j++){
                two[i][j] = scn.nextInt();
            }
        }

        if(matrix1kecolums != matrix2kirows){
            System.out.println("Invalid input");
            return;
        }

        int[][] prd = new int[matrix1kirows][matrix2kecolums];
        for(int i = 0; i < prd.length; i++){
            for(int j = 0; j < prd[0].length; j++){
                int val = 0;

                for(int k = 0; k < matrix1kecolums; k++){
                    val += one[i][k] * two[k][j];
                }

                prd[i][j] = val;
            }
        }

        for(int i = 0; i < prd.length; i++){
            for(int j = 0; j < prd[0].length; j++){
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
