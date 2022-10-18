/*
    We are going to print character pattern like this
            *
          * *
        * * *
      * * * *
    So the pattern has
       n no of rows,
       the row has i no of cols, and n-i no of spaces.
       So we have to run 2 loops for the star and spaces.
 */
package Patterns.TrianglePattern;
import java.util.*;
public class TriangularPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n){
            int spaces = n-row;
            while(spaces!=0){
                System.out.print(" ");
                spaces -= 1;
            }
            int col = 1;
            while (col <= row){
                System.out.print('*');
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
