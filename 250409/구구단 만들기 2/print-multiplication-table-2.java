import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
            
        // 4 2, 3 2, 2 2
        // 4 4, 2 3, 3, 4
        // 첫 숫자는 바뀌고 뒷 숫자는 고정. 


        
        for(int j = 2; j <= 8; j+=2) {
            for(int i = m; i >= n ; i--) {
                System.out.print(i+" * "+j +" = "+i*j);
                if(i > n) {
                    System.out.print(" / ");
                }
            }
            
            System.out.println();
        }
        


    }
}