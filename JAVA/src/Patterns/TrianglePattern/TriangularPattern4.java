/*
    We have to print a Triangular pattern
        1
        2 3
        4 5 6
        7 8 9 10
        so here are n rows,
        the row has 'N' no of col,
        and we have to print
*/
package Patterns.TrianglePattern;
import java.util.*;
public class TriangularPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        int count = 1;
        while(row <= N){
            int col = 1;
            while(col <= row){
                System.out.print(count + " ");
                col = col + 1;
                count = count + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
