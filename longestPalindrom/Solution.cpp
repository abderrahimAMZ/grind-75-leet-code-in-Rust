//
// Created by amz on 16/01/24.
//
// how to declare a stack in cpp?

#include <stack>
#include <iostream>
#include <unordered_map>

#include "Solution.h"
Solution::Solution() {
    memo = std::unordered_map<int, int>();
}
int Solution::longestPalindrome(std::string s){
    for (char chara: s){
        if (memo.find(chara) == memo.end()){
            memo[chara] = 1;
        } else {
            memo[chara] += 1;
        }

    }
    int result = 0;
    bool hasOdd = false;

    for (auto it = memo.begin(); it != memo.end(); ++it){
        if (it->second % 2 == 0){
            result += it->second;
        } else {
            result += it->second - 1;
            hasOdd = true;
        }

    }
    if (hasOdd){
        result += 1;
    }
    return result;
}
