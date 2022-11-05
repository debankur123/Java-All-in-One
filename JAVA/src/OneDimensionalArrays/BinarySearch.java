package OneDimensionalArrays;
import java.util.*;
public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] input = takeInputs();
        System.out.println("The data to be searched : ");
        int item = sc.nextInt();
        int result = binarySearch(input,item);
        if (result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at : " +  result + "th index");
        }
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
    public static int binarySearch(int[] arr,int item){
        int low = 0;
        int high = arr.length-1;
        while (low <=  high){
            int mid = (low+high)/2;
            if (arr[mid] < item){
                low = mid+1;
            } else if (arr[mid] > item) {
                high = mid -1;
            } else if (arr[mid] == item) {
                return mid;
            }
        }
        return -1;
    }
}
