import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        n = 4
        i/j 0  1  2  3   짝수 -> 홀수 <- 
        0   1  2  3  4   짝수행 시작값 1, 9, 17... -> i * n + 1
        1   8  7  6  5   홀수행 시작값 8, 16, 21... -> i * n + 1
        2   9  10 11 12  
        3   16 15 14 13
                          
            i/j 0  1  2  3 i*n+j+1 짝수일땐 1 홀수일땐 3부터
                           짝수: i*4+j+1 (j는 1씩 증가)
        ex) 0   1  2  3  4       1 2 3 4
                            홀수: i*4+j+1 (j는 3부터 1씩 감소)
            1   8  7  6  5       8 7 6 5

        */
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j < n; j++) {
                    System.out.print(i*n+j+1+" ");
                }
            } else {
                for(int j = n - 1; j >= 0; j--) {
                    System.out.print(i*n+j+1+" ");
                }

            }
            System.out.println();
        }
    }
}