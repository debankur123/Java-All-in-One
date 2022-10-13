/*
    We have to print a Triangular pattern
        1
        2 2
        3 3 3
        4 4 4 4
        so here are n rows,
        the row has i no of col,
        and we have to print row
*/
package Patterns.TrianglePattern;
import  java.util.*;
public class TrianglePattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while(row <= N){
            int col = 1;
            while(col <= row){
                System.out.print(row + " ");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
