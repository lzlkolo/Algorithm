import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 집합S에 포함되어 있는 문자열 개수
        int n = Integer.parseInt(st.nextToken());
        // 검사할 문자열 개수
        int m = Integer.parseInt(st.nextToken());
        // 문자열 집합
        Map<String, Integer> stringSet = new HashMap<>();
        for (int i = 0; i < n; i++) {
            stringSet.put(br.readLine(), 0);
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (stringSet.containsKey(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}