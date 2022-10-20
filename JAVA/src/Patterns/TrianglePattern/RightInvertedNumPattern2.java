/*
We have to print a pattern like this .
        1
      2 2
    3 3 3
  4 4 4 4
So the pattern has
       n no of rows,
       the row has i cols,
       So we have to loop through this (n-1+1) column no and print i. and for spaces we will go through
       n-i.
*/
package Patterns.TrianglePattern;
import java.util.*;
public class RightInvertedNumPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n){
            int spaces = n - row;
            while (spaces!=0){
                System.out.print(" ");
                spaces -= 1;
            }
            int col = 1;
            while (col <= row - 1 + 1){
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
