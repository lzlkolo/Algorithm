import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int result = 0;
        long[] a = new long[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(a);

        for (int k = 0; k < n; k++) {
            long find = a[k];
            int i = 0;
            int j = n - 1;
            
            while (i < j) {
                if (a[i] + a[j] == find) {
                    if (i != k && j != k) {
                        result++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (a[i] + a[j] < find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(result);
        bf.close();
    }
}
