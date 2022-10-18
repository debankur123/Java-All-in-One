/*
    We are going to print character pattern like this
        A A A A
        B B B B
        C C C C
        D D D D
    So the pattern has
       n no of rows,
       the row has i no of cols,
       and we have to print the ch value which has been initialised by 'A'
 */
package Patterns.CharacterPatterns;
import java.util.Scanner;
public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        for (row = 1;row <= n;row++){
            char ch = (char) ('A' + (row-1));
            for (int col = 1;col <= n;col++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
