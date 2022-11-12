package SortingTechniques;
import java.util.*;
public class BubbleSort {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] input = takeInputs();
        bubbleSort(input);
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
    public static void bubbleSort(int[] arr){
        for (int preCounter=0;preCounter<arr.length-1;preCounter++){
            for (int postCounter=0;postCounter<arr.length-1-preCounter;postCounter++){
                if (arr[postCounter] > arr[postCounter+1]){
                    int temp = arr[postCounter];
                    arr[postCounter] = arr[postCounter+1];
                    arr[postCounter+1] = temp;
                }
            }
        }
    }
}
