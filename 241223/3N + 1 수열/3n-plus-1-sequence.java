import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (true) {
            if ( n == 1 ) {
                break;
            }

            count++;
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n += 1;
            } 

            
        }

        System.out.print(count);
    }
}