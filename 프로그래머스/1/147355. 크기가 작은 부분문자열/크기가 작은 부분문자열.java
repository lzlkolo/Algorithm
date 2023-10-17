class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int sPoint = 0;

        int range = t.length() - p.length() + 1;
        Long target = Long.parseLong(p);

        for (int i = 0; i < range; i++) {
            int ePoint = sPoint + p.length();
            long d = Long.parseLong(t.substring(sPoint, ePoint));
            if (d <= target) {
                answer++;
            }
            sPoint++;
        }
        
        return answer;
    }
}