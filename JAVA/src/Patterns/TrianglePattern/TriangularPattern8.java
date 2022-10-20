/*
    We are going to print Triangular star pattern like this
       * * * *
       * * *
       * *
       *
    So the pattern has
       n no of rows,
       the row has (n-i+1) no of cols,
       So we have to loop through this (n-i+1) column no and print '*'.
 */
package Patterns.TrianglePattern;
import java.util.*;
public class TriangularPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            int col = 1;
            while(col <= n-row+1){
                System.out.print('*');
                col = col + 1;
            }
            System.out.println();
            row += 1;
        }
    }
}
