import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        
        // 1번
    //     int min = arr[0];

    //     for(int i = 0; i < arr.length; i++) {
    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }

    //     int[] new_arr = new int[arr.length - 1];
    //     for(int i = 0, j = 0; i < arr.length; i++) {
    //         if (arr[i] != min) {
    //             new_arr[j++] = arr[i];
    //         }
    //     }
        
    //     int mid = new_arr[0];
    //     for(int i = 0; i < new_arr.length; i++) {
    //         if (new_arr[i] < mid) {
    //             mid = new_arr[i];
    //         }
    //     }
    //     System.out.println(mid);
    
        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}