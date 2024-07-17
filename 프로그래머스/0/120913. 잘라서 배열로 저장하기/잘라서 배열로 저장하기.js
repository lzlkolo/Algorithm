function solution(my_str, n) {
    var answer = [];
    let res = [];
    
    for (let i = 0; i < my_str.length; i += n) {
        res.push(my_str.slice(i, i+n));
    }
    
    return res;
}

