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


        
        for(int i = 2; i <= n*m; i+=2) {
            for(int j = m; j >= 2 ; j--) {
                System.out.print(j+" * "+i +" = "+i*j);
            if(j > 2) {
                System.out.print(" / ");
            }
            }
            
            System.out.println();
        }
        


    }
}