import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 과목 수
        int n = Integer.parseInt(bf.readLine());
        int[] score = new int[n];

        // 과목별 점수 socre 배열에 저장
        StringTokenizer st = new StringTokenizer(bf.readLine());
        score = setScore(st, score);

        // 최댓값 구하기
        double max = 0;
        max = getMaxScore(score);

        //성적 합 구하기
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // 평균 구하기
        double average = 0.0;
        average = sum / (max * n) * 100.0;

        System.out.println(average);
    }

    private static int[] setScore(StringTokenizer st, int[] score) {
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        return score;
    }

    private static int getMaxScore(int[] score) {
        int max = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }
}