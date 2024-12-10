import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 31일 1,3,5,7,8,10,12
        // 30일 4,6,9,11
        // 28,29 일 2
        if ( n == 2 ) {
            System.out.println(28);
        } else if (n == 4 || n == 6 || n == 9 || n == 11 ) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }

    }
}