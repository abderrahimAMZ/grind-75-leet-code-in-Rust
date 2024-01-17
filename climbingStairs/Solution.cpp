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
int Solution::fac(int n) {
    if (n==1) return 1;
    return n*fac(n-1);
}
int Solution::climbStairs(int n) {
            if ( n ==1) return 1;
            if ( n ==2) return 2;
            if (memo.find(n) == memo.end()){
                memo[n] = climbStairs(n-1) + climbStairs(n-2);
            }
            return memo[n];

        }
