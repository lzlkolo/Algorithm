function solution(num, total) {
    var answer = [];
    let sum = num * (1 + num) / 2;
    let start = (total - sum) / num;

    for (var i = 0; i < num; i++)  {
        answer[i] = start + i + 1;
    }
    
    return answer;
}