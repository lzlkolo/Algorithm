import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] arr = input.toCharArray();
        int[] alphabet = new int[26];

        for (int i=0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for(int i = 0; i<arr.length; i++) {
            int index = arr[i]-97;
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            } else {
                continue;
            }
        }

        for (int i : alphabet) {
            System.out.printf("%d ", i);
        }
    }
}