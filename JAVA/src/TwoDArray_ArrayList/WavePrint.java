package TwoDArray_ArrayList;
import java.util.Scanner;
public class WavePrint {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int[][] inputs = takeInputs();
        rowWiseWave(inputs);
    }

    public static void rowWiseWave(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                for(int j=0;j<arr[i].length;j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else {
                for(int j=arr[i].length-1;j>=0;j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static int[][] takeInputs(){
        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no of column : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
