import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /*
        n = 4
        i/j
            0  1  2  3  i가 짝수일때 1씩 증가 홀수일때 2씩증가 
        0|  1  2  3  4  행 간 연결된 수 끝 4, 12
        1|  6  8 10 12  시작 2행 4 + 2 = 6 -> 8 -> 10 -> 12
        2| 13 14 15 16  3행 홀수 끝 12 + 1 = 13 -> 14 -> 15 -> 16
        3| 18 20 22 24  4행 짝수 끝 16 + 2 = 18 -> 20 -> 22 -> 24

                즉, 홍수 행 -> 짝숙 행 : 마지막 숫자 + 2
                짝수 행 -> 홀수행: 마지막 숫자 + 1
        

        */
       int current = 1;

        for (int i = 0; i < n; i++) {  // 행 반복
             // 열 반복
            if ( i %2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(current + " ");
                    current += 1;
                }
                current += 1;
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(current+ " ");
                    current += 2;
                }
                current -= 1;
            }
            System.out.println();
        }
    }
}