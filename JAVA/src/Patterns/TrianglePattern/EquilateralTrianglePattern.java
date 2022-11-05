/*
    We have to print a pattern like this
        1
       121
      12321
     1234321
    123454321
    So we divided it into 3 parts nd print them respectively
 */
package Patterns.TrianglePattern;
import java.util.*;
public class EquilateralTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n){
            int spaces = n-row;
            while (spaces!=0){
                System.out.print(" ");
                spaces--;
            }
            int col1 = 1;
            while (col1 <= row){
                System.out.print(col1);
                col1++;
            }
            int col2 = row-1;
            while (col2!=0){
                System.out.print(col2);
                col2--;
            }
            System.out.println();
            row++;
        }
    }
}
