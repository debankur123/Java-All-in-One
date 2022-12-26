package CRX_Leetcode_1DArrays.src.CRX_Leetcode_1DArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leetcode_IntersectionOf2Arrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] input1 = takeInputs1();
		int[] input2 = takeInputs2();
		int [] output = intersection(input1,input2);
		display(output);
		
	}
	public static int[] takeInputs1(){
        System.out.println("Enter the size ?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
	public static int[] takeInputs2(){
        System.out.println("Enter the size ?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
	public static int[] intersection(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		List<Integer> intersection = new ArrayList<>();
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j] && !intersection.contains(arr1[i])) {
				intersection.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
		int[] result = new int[intersection.size()];
		int idx = 0;
		for(int num=0;i<intersection.size();num++) {
			result[idx] = num;
			idx++;
		}
		return result;
	}
	public static void display(int[] result) {
		for(int idx=0;idx<result.length;idx++) {
			System.out.print(result[idx] + " ");
		}
	}

}
