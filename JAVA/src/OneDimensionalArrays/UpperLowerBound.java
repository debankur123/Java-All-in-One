package OneDimensionalArrays;
import java.util.*;
public class UpperLowerBound {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        int result1 = upperBound(arr,3);
        int result2 = lowerBound(arr,3);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int[] takeInputs(){
        System.out.println("Enter the size ?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value for " + i + "th index " );
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int lowerBound(int[] arr,int data){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == data){
                ans = mid;
                high = mid -1;
            } else if (arr[mid] < data) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr,int data){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == data){
                ans = mid;
                high = mid + 1;
            } else if (arr[mid] < data) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

