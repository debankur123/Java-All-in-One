package OneDimensionalArrays;
import java.util.*;
public class LinearSearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] input = takeInputs();
        System.out.println("The data to be searched : ");
        int item = sc.nextInt();
        System.out.println("The data found at : " + linearSearch(input,item));
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
    public static int linearSearch(int[] arr,int item){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
