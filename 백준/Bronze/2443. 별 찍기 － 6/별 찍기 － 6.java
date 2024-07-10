import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 2 * n - 1;
        String empty = "";

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                empty += " ";
            }
            System.out.println(empty + makeStar(count));
            count -= 2;
        }
    }

    private static String makeStar(int count) {
        String star = "";
        for (int i = 0; i < count; i++) {
            star += "*";
        }
        return star;
    }
}
