/*
We have to print a pattern like this .
    ****
     ***
      **
       *
So the pattern has
       n no of rows,
       the row has (n-i+1) no of cols,
       So we have to loop through this (n-i+1) column no and print '*'. and for spaces we will go through
       i-1.
*/
package Patterns.TrianglePattern;
import java.util.*;
public class RightInvertedPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            int spaces = row-1;
            while(spaces!=0){
                System.out.print(" ");
                spaces = spaces-1;
            }
            int col = 1;
            while (col <= n-row+1){
                System.out.print("*");
                col += 1;
            }
            System.out.println();
            row += 1;
        }
    }
}
