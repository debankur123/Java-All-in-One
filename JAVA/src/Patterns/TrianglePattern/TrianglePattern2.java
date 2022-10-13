/*
    We have to print a Triangular pattern
        *
        * *
        * * *
        * * * *
        so here are n rows,
        the row has i no of col,
        and we have to print j
*/
package Patterns.TrianglePattern;
import java.util.*;
public class TrianglePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while(row <= N){
            int col = 1;
            while(col <= row){
                System.out.print("*" + " ");
                col = col + 1;
            }
            row = row + 1;
            System.out.println();
        }
    }
}
