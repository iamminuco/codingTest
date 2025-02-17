import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = n;
        int num = 0;

        for(int i = 1; i <= n; i++) {
                num = start * i;
            for(int j = 0; j < n; j++ ){
                System.out.print(num+" ");
                num -= i;
            }
            System.out.println();
        }
    }
}