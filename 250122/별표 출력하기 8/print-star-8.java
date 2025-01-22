import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for (int i = 0; i < 6; i++) {
            if( i % 2 == 0) {
                 System.out.print("*");
            } else {
                for(int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }         
            }
            System.out.println();
        }       
    }
}