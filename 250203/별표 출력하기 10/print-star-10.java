import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n * 2; i++) {
            if ( i % 2 == 0) { // 짝수 n이 3일 경우 0, 2, 4
                for (int j = 0; j < 1 + (i /2); j++) {
                    System.out.print("* ");
                }
            } else { // 홀수 1, 3, 5
                for (int j = 0; j < n - (i - 1) / 2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

// *         1     0
// * * *      3    1
// * *       2     2
// * *        2    3
// * * *     3     4
// *          1    5