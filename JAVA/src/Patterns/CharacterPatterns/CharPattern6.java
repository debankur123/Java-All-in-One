/*
    We are going to print character pattern like this
        A
        B C
        D E F
        G H I J
    So the pattern has
       n no of rows,
       the row has i no of cols,
       and we have to print value of (ch) initialised by 'A' and
       increment it in the inner while loop
 */
package Patterns.CharacterPatterns;
import  java.util.*;
public class CharPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        char ch = 'A';
        while(row <= N){
            int col = 1;
            while(col <= row){
                System.out.print(ch + " ");
                ch += 1;
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
