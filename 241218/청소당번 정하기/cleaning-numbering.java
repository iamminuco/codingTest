import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt_2 = 0;
        int cnt_3 = 0;
        int cnt_12 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                cnt_12++;
            } else if (i % 3 == 0) {
                cnt_3++;
            } else if (i % 2 == 0) {
                cnt_2++;
            } 
        }
        System.out.print(cnt_2+" "+cnt_3+" "+cnt_12);
    }
}