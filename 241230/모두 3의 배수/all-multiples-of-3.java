import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n;
        int prod = 1;
        boolean isSide = true;

        for (int i = 1; i <= 5; i++) {
            n = sc.nextInt();

            if (n % 3 != 0) {
                isSide = false;
                break;
            }
        }

        if(isSide) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}