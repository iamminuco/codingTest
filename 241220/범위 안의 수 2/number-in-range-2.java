import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int cnt = 0;
        double avg = 0.0;

        for (int i = 1; i <= 10; i++ ) {
            n = sc.nextInt();
            if ( n >=0 && n <=200) {
                sum += n;
                cnt++;
            }
        }
        
        avg = (double) sum/cnt;

        System.out.printf("%d %.1f", sum, avg);

    }
}