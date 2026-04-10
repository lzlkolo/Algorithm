class Solution {
    public int[] solution(int money) {
        int coffeePrice = 5500;
        int coffee = money / coffeePrice;
        int change = money % coffeePrice;
        
        int[] answer = {coffee, change};
        
        return answer;
    }
}