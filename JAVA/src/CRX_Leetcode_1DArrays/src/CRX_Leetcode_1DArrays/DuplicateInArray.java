package CRX_Leetcode_1DArrays.src.CRX_Leetcode_1DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] inputs = takeInputs();		
		System.out.println("The duplicate value is : " + findDuplicate(inputs));
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
	public static int findDuplicate(int[] arr) {
		Arrays.sort(arr);
		int low = 1;
		int high = arr.length-1;
		while(low < high) {
			int mid = low + (high-low)/2;
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] <= mid) {
					count++;
				}
			}
			if(count <= mid) {
				low = mid+1;
			}else {
				high = mid;
			}
		}
		return low;
	}

}
