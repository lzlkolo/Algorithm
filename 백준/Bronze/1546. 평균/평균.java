import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //과목수, 시험성적 입력받기
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();

        int[] score = new int[subject];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        //성적 합 구하기
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        //시험성적 중 최대값 구하기
        double max = Integer.MIN_VALUE;

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        System.out.println(sum / (max * subject) * 100.0);
    }
}
