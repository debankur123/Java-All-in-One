/*
    We are going to print character pattern like this
       D
       C D
       B C D
       A B C D
    So the pattern has
       n no of rows,
       the row has i no of cols,
       so we have to find the first character and then increment it by 1
       We have to print ('A' + n - row)
 */
package Patterns.CharacterPatterns;
import java.util.*;
public class CharPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n){
            int col = 1;
            char ch = (char) ('A' + n - row);
            while(col <= row){
                System.out.print(ch+" ");
                ch += 1;
                col += 1;
            }
            System.out.println();
            row += 1;
        }
    }
}
