import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int start = 11;
        int num = 0;

        for(int i = 0; i < n; i++) {
            num = start+(i*2);
            for(int j = 0; j < n; j++ ){
                System.out.print(num + " ");
                num+=2;
            }
            System.out.println();
        }
    }
}