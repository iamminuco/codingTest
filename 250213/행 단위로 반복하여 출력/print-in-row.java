import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        i \ j 0 1 2 3 4 
        0     1 2 3 4 5
        1     1 2 3 4 5
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}