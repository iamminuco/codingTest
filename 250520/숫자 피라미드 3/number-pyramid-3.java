import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // i * 2 3 4 ...

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}