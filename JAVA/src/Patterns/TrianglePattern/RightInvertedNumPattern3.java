/*
We have to print a pattern like this .
       1 2 3 4
         2 3 4
           3 4
             4
So the pattern has
       n no of rows,
       the row has n-row+1 cols,
       So we have to print a value which holds the 1st value of each row and then increment it by 1
*/
package Patterns.TrianglePattern;
import java.util.*;
public class RightInvertedNumPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n){
            int spaces = row-1;
            while (spaces!=0){
                System.out.print(" ");
                spaces--;
            }
            int col = 1;
            int data = row;
            while (col <= n-row+1){
                System.out.print(data);
                data++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
