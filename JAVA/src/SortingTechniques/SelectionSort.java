package SortingTechniques;
import java.util.*;
public class SelectionSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] input = takeInputs();
        selectionSort(input);
        display(input);
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
    public static void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int[] arr){
        for (int outer=0;outer<arr.length-1;outer++){
            // Find the minimum element in unsorted array
            int min = outer;
            for (int inner=outer+1;inner<arr.length;inner++){
                if (arr[inner] < arr[min]){
                    min = inner;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[outer];
            arr[outer] = temp;
        }
    }
}
