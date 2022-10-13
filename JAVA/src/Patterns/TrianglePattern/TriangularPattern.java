/*
    We have to print a Triangular pattern
        1
        1 2
        1 2 3
        1 2 3 4
        so here are n rows,
        the row has i no of col,
        and we have to print j
        EXT50
*/
package Patterns.TrianglePattern;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1;row <= n;row++){
            for (int col = 1;col <= row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
