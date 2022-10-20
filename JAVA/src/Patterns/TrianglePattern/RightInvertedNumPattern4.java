/*
We have to print a pattern like this .
           1
         2 3
       4 5 6
    7 8 9 10
So the pattern has
       n no of rows,
       the row has n-1+1 cols,
       So we have to print a count value initialised by 1
       and after all col increment we will increment count by 1.
*/
package Patterns.TrianglePattern;
import java.util.*;
public class RightInvertedNumPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int count = 1;
        while (row <= n){
            int spaces = n-row;
            while (spaces!=0){
                System.out.print(" ");
                spaces--;
            }
            int col = 1;
            while (col <= row-1+1){
                System.out.print(count);
                count++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
