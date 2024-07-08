import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
            if (number[i] == 0) {
                for (int j = i-1; j >= 0; j--) {
                    if (number[j] != 0) {
                        number[j] = 0;
                        break;
                    }
                }
            }
        }

        int total = 0;
        for (int i = 0; i < number.length; i++) {
            total += number[i];
        }

        System.out.println(total);
    }
}