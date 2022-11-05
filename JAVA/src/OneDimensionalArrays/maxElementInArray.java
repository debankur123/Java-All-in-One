package OneDimensionalArrays;
import java.util.*;
public class maxElementInArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] inp = takeInputs();
        System.out.println("The value of maximum element is :" + maxElement(inp));
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
    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
