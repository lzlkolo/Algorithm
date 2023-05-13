import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 5;
        int[] arr = new int[num];
        int avg, mid;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            sum = sum + arr[i];
        }

        mid = arr[num/2];
        avg = sum / num;

        System.out.println(avg);
        System.out.println(mid);
    }
}