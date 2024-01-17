//
// Created by amz on 17/01/24.
//

#ifndef LINKEDLISTCYCLE_SOLUTION_H
#define LINKEDLISTCYCLE_SOLUTION_H


#include "string"


#include "unordered_map"
class Solution {
    std::unordered_map<int, int> memo;
public:
    Solution();
    int longestPalindrome(std::string s);
    };

#endif //LINKEDLISTCYCLE_SOLUTION_H
