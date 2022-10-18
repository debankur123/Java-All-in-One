/*
    We are going to print character pattern like this
        A B C
        A B C
        A B C
    So the pattern has
       n no of rows,
       the row has N no of cols,
       and we have to print the ch value which has been initialised by 'A'
 */
package Patterns.CharacterPatterns;
import java.util.*;
public class CharacterPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while(row <= N){
            int col = 1;
            while (col <= N){
                char ch = (char) ('A' + (col-1));
                System.out.print(ch + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
