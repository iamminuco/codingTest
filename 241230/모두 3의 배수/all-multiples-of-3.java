import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n;
        int prod = 1;
        boolean isSide = false;

        for(int i = 1; i <= 5; i++) {
            n = sc.nextInt();

            prod *= 3;

            if(n % prod == 0) {
                isSide = true;
            }
        }
        if (isSide) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}