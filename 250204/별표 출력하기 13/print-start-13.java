import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* n = 3
        i         실제 행 번호   짝수(0,2,4) 홀수(1,3,5) i         
        0  * * *         1       3                n - (0/2) = 3
        1  *             2                   1    1 + (1-1)/2 = 3       
        2  * *           3       2                n - (2/2) = 2
        3  * *           4                   2    1 + (3-1)/2 = 2
        4  *             5       1                n - (4/2) = 1
        5  * * *         6                   3    1 + (5-1)/2 = 3
                                                   */

        for(int i = 0; i < n*2; i++) {
            // 짝수 n - (i/2)
            if (i % 2 == 0) {
                for (int j = 0; j < n - (i/2); j++) {
                    System.out.print("* ");
                }
            // 홀수 1 + (i -1)/2
            } else {
                for (int j = 0; j < 1 + (i-1)/2; j++) {
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
    }
}