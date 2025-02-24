import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 10;
        
        for(int i= 0; i < n; i++){
            for(int j= 0; j < n; j++) {
                num = num > 1 ? num -1 : num + 8;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}