import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArr = s.split(":");
        int h = Integer.parseInt(sArr[0]);
        int m = Integer.parseInt(sArr[1]);

        if( 1 <= h && h <= 22 && 0 <= m && m < 60) {
            h += 1;  
            System.out.print(h+":"+m);
            // 문자든 정수형이든 모양만 같으면 되는구먼..?
        }
        
    }
}