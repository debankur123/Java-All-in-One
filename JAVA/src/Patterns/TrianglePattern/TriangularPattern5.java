/*
    We have to print a Triangular pattern
        1
        2 3
        3 4 5
        4 5 6 7
        5 6 7 8 9
        so here are n rows,
        the row has 'i' no of col,
        and we have to print the  value of row and increment it with 1 ,
        if there are 3 rows the starting will be 1 for row 1
        2 for row 2 and 3 for row 3
*/
package Patterns.TrianglePattern;
import java.util.*;
public class TriangularPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while (row <= N){
            int col = 1;
            int count = row;
            while (col <= row){
                System.out.print(count + " ");
                count = count + 1;
                col = col + 1;
            }
            System.out.println();
            row = row + 1 ;
        }
    }
}
