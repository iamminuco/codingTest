import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(cnt);
                cnt = (cnt % 9)+ 1;

            }
            System.out.println();
        }
    }
}