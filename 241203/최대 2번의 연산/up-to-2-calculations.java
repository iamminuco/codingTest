import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if ( num %2 == 0) {
            num /= 2;
        } 

        if ( num %2 != 0) {
            num += 1; 
            num /= 2;
        }
        
        System.out.println(num);  
    }
}