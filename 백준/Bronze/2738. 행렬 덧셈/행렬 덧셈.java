import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] numArr = new int[n][m];
 
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                numArr[row][column] = scanner.nextInt(); // 기존 값 추가
            }
        }
 
        for (int addRow = 0; addRow < n; addRow++) {
            for (int addColumn = 0; addColumn < m; addColumn++) {
                numArr[addRow][addColumn] += scanner.nextInt(); // 기존 값 + 새로 입력받은 값
                System.out.print(numArr[addRow][addColumn] + " ");
            }
            System.out.println();
        }
    }
}