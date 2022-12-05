package CRX_Leetcode_1DArrays;
import java.util.Scanner;
public class SwapAlternate {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] inputs = takeInputs();
		swapAlternate(inputs);
		display(inputs);
	}
	public static int[] takeInputs(){
        System.out.println("Enter the size ?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
	public static void swapAlternate(int[] arr) {
		for(int i=0;i<arr.length;i+=2) {
			if(i+1 < arr.length) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
	}
	public static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
