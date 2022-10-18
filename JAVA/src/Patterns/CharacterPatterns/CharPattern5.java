/*
    We are going to print character pattern like this
        A
        B B
        C C C
        D D D D
    So the pattern has
       n no of rows,
       the row has i no of cols,
       and we have to print A+j-1
 */
package Patterns.CharacterPatterns;
import java.util.*;
public class CharPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while (row <= N){
            int col = 1;
            while(col <= row){
                char  ch = (char) ('A'+row-1);
                System.out.print(ch + " ");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
