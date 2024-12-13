import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        int sum = a+n;
        
       while ( i <= n) {
        System.out.println(sum);
        sum += n;
        i++;
       }
    }
}