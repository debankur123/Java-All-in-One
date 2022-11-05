package OneDimensionalArrays;
import java.util.*;
public class SwapArrayElements {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInputs();
        int val1 = array[0];
        int val2 = array[2];
        Swap(array,val1,val2);
        display(array);
    }
    public static void Swap(int[] arr,int val1,int val2){
        int temp = val1;
        val1 = val2;
        val2 = temp;
    }
    public static int[] takeInputs(){
        System.out.print("Enter the size ?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the value for " + i + "th index " );
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
