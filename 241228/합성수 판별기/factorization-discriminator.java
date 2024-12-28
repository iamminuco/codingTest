import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ishab = false;
        char s = ' ';

        for(int i = 1; i < n; i++) {

            if(n % i == 0) {
                s = 'C';
            } else {
                s = 'N';
            }

        }
        
        if (s == 'C') {
            System.out.println(s);
        } else {
            System.out.println(s);
        }
        
    }
}