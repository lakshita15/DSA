public class WaveDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[r][c];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //column loop
        for (int column = 0; column < arr[0].length; column++) {
            if(column%2==0){
                for (int row = 0; row < arr.length; row++) {
                    System.out.println(arr[row][column]);
                }
            }else{
                for (int row = arr.length-1; row >=0; row--) {
                    System.out.println(arr[row][column]);
                }
            }
        }
    }
}
