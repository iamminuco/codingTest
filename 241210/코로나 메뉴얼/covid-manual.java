import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a_cold = sc.next().charAt(0);
        int a_temp = sc.nextInt();

        char b_cold = sc.next().charAt(0);
        int b_temp = sc.nextInt();

        char c_cold = sc.next().charAt(0);
        int c_temp = sc.nextInt();

        char[] cold_check = {a_cold, b_cold, c_cold};
        int[] temp = {a_temp, b_temp, c_temp};

        int count_temp = 0;

        for(int i = 0; i < cold_check.length; i++) {
            if(cold_check[i] == 'Y' && temp[i] >= 37){
                 count_temp += 1;
            }     
        }

        if(count_temp >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
        
    }
}