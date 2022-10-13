/*
    We have to print a number pattern like this
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
 */
package Patterns.NumberPatterns;
import java.util.Scanner;
public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
