/*
    We have to print a number pattern like this
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
    We will take 'n' no of rows
    for ith general row n cols are needed
    we have to print n-j+1 cols to generate pattern
 */
package Patterns.NumberPatterns;
import java.util.Scanner;
public class NumberPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print(n-col+1 + " ");
            }
            System.out.println();
        }
    }
}
