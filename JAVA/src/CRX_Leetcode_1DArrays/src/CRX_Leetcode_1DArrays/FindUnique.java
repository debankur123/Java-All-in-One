package CRX_Leetcode_1DArrays.src.CRX_Leetcode_1DArrays;
import java.util.*;
public class FindUnique {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] input = takeInputs();
		int result = findUnique(input);
		System.out.println("The unique element is : " + result);
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
	public static int findUnique(int[] arr) {
		int ans = 0;
        for(int i=0;i<arr.length;i++) {
            ans = ans ^ arr[i];
        }
        return ans;
//        for(int i = 0; i < arr.length; i++) {
//            int j;
//            for(j = 0; j < arr.length; j++) {
//                if(i != j) {
//                    if(arr[i] == arr[j]) {
//                        break;
//                    }
//                }
//            }
//            if(j == arr.length) {
//                return arr[i];
//            }
	}
}
/*6, 2, 5, 2, 2, 6, 68*/
