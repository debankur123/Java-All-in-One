package SortingTechniques;
import java.util.*;
public class InsertionSort {
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
        for (int i=1;i< arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = temp;
        }
    }
}
