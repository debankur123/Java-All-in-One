/*
    We are going to print character pattern like this
        A
        B C
        C D E
        D E F G
    So the pattern has
       n no of rows,
       the row has i no of cols,
       we have to find a formula to print the pattern.We have to map 1 with A ,B with 2 and so on
       we came to a formula of (row+col-1) which gives 1  for row = 1 col=1. So now we have
       to map 1 with A. we have row+col-1 = 1 so balance it add A-1 on both sides
       (row+col-1+A-1) = A-1+1
       or, row+col+A-2 = A; ......(i) this is the equation and the print statement
 */
package Patterns.CharacterPatterns;
import java.util.*;
public class CharPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 1;
        while (row <= N){
            int col = 1;
            while(col <= row){
                char ch = (char) ('A' + row + col - 2);
                System.out.print(ch+" ");
                col +=1;
            }
            System.out.println();
            row += 1;
        }
    }
}
