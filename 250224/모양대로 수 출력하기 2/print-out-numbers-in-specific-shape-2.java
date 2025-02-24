import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 0;
        for(int i= 0; i < n; i++){
            for(int j= 0; j < n; j++) {
                num = (num % 8) + 2;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}