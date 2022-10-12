/*
    We have to print a pattern like this
    1 1 1 1
    2 2 2 2
    3 3 3 3
    4 4 4 4
*/
package Patterns;
import java.util.*;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1;row<=n;row++){
            for (int col = 1;col<=n;col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
