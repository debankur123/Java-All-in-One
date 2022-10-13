/*
    We have to print a number increasing pattern like this
        1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16
    We will take 'n' no of rows
    for ith general row n cols are needed
    we have to print an extra counter variable for each row the counter value will be incremented
 */
package Patterns.NumberPatterns;
import java.util.*;
public class numberPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        for (int row=1;row<=N;row++){
            for (int col=1;col<=N;col++){
                System.out.print(count + " ");
                count = count + 1;
            }
            System.out.println();
        }
    }
}
