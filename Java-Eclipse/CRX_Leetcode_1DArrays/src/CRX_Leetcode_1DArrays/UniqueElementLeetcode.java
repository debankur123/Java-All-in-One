/*
   Given an array of integers , return true if the number of occurrences of each value in the
   array is unique, or false otherwise.
	Example 1: 
	
	Input: arr = [1,2,2,1,1,3]
	Output: true
	Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same
	number of occurrences.
	
	Example 2 :
	
	Input: arr = [1,2]
	Output: false
	
	Example 3:
	
	Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
	Output: true
	
	Constraints :
		
    1 <= arr.length <= 1000
    -1000 <= arr[i] <= 1000
*/

package CRX_Leetcode_1DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementLeetcode {
	final static int size = 1000;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] inputs = takeInputs();
		System.out.println("The result is : " + uniqueOccurrences(inputs));
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
	    
    public static boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2 * size + 1];      
        // Store the frequency of elements in the unordered map.
        for (int num : arr) {
            freq[num + size]++;
        }        
        // Sort the frequency count.
        Arrays.sort(freq);
        // If the adjacent freq count is equal, then the freq count isn't unique.
        for (int i = 0; i < 2 * size; i++) {
            if (freq[i] != 0 && freq[i] == freq[i + 1]) {
                return false;
            }
        }
        // If all the elements are traversed, it implies frequency counts are unique.
        return true;
	}

}
