//
// Created by amz on 17/01/24.
//

#ifndef LINKEDLISTCYCLE_SOLUTION_H
#define LINKEDLISTCYCLE_SOLUTION_H





#include "unordered_map"


class Solution {
    std::unordered_map<int, int> memo;
public:
    Solution();
    int climbStairs(int n);
    int fac(int n);
    };

#endif //LINKEDLISTCYCLE_SOLUTION_H
