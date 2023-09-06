import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] answer = new String[a.length()];
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if (c >= 97 && c <= 122) {
                answer[i] = String.valueOf(c).toUpperCase();
            } else {
                answer[i] = String.valueOf(c).toLowerCase();
            }
            
            System.out.print(answer[i]);
        }
    }
}