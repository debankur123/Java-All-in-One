/*
    We are going to print character pattern like this
        A B C
        D E F
        G H I
        J K L
    So the pattern has
       n no of rows,
       the row has N no of cols,
       and we have to print the start value which has been initialised by 'A' and
       incremented as per need.
 */
package Patterns.CharacterPatterns;
import java.util.*;
public class CharPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        char start = 'A';
        while (row <= N){
            int col = 1;
            while(col <= N){
                System.out.print(start + " ");
                start = (char) (start + 1);
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
