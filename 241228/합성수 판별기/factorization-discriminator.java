import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ishab = false;

        for(int i = 2; i < n; i++) {

            if(n % i == 0) {
               ishab = true;
            } 

        }
        
        if (ishab) {
            System.out.println("C");
        } else {
            System.out.println("N");
        }
        
    }
}