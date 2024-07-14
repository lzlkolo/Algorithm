import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length1 = sc.nextInt();
        int length2 = sc.nextInt();

        int min = Math.min(length1, length2);
        int radius = ( min * 100 )/ 2;

        System.out.println(radius);
    }
}