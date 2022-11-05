package OneDimensionalArrays;
import java.util.Scanner;
public class ArrayOps {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInputs();
        display(array);
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
