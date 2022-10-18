/*
    We have to print a Triangular pattern
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        so here are n rows,
        the row has 'i' no of col,
        we have to print a formula that will decrement of row value after printing 1st row no
*/
package Patterns.TrianglePattern;
import java.util.*;
public class TriangularPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while (row <= N){
            int col = 1;
            while (col <= row){
                System.out.print(row-col+1 + " ");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
