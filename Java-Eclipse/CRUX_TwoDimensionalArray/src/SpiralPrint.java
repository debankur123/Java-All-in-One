/*
  We have to print a 2D matrix/Array in a spiral form 
  The matrix is given below :
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
  	
  	Now the output will be in a spiral way :
  	11,12,13,14,24,34,44,43,42,41,31,21,22,23,33,32
*/
import java.util.Scanner;
public class SpiralPrint {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] inputs = takeInputs();
		printSpiral(inputs);
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
	public static void printSpiral(int[][] arr) {
		int top,bottom,left,right,count,direction;
		top = 0;
		bottom = arr.length-1;
		left = 0;
		right = arr[top].length-1;
		count = (bottom+1)*(right+1);
		direction = 1;
		while(left<=right && top<=bottom) {
			if(count > 0) {
				if(direction == 1) {
					for(int i=left;i<=right;i++) {
						System.out.print(arr[top][i] + ","); // here arr[top] is fixed col(i) is moving
						count--;
					}
					direction = 2;
					top += 1;   
				}
			}
			if(count > 0) {
				if(direction == 2) {
					for(int i=top;i<=bottom;i++) {
						System.out.print(arr[i][right] + ",");
						count -= 1;
					}
					direction = 3;
					right -= 1;
				}
			}
			if(count > 0) {
				if(direction == 3) {
					for(int i=right;i>=left;i--) {
						System.out.print(arr[bottom][i] + ",");
						count--;
					}
					direction = 4;
					bottom -= 1;
				}
			}
			if(count > 0) {
				if(direction == 4) {
					for(int i=bottom;i>=top;i--) {
						System.out.print(arr[i][left] + ",");
						count -= 1;
					}
					direction = 1;
					left ++;
				}
			}
		}
		System.out.println("End");
	}

}
