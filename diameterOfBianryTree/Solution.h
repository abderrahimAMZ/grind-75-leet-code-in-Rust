//
// Created by amz on 17/01/24.
//

#ifndef LINKEDLISTCYCLE_SOLUTION_H
#define LINKEDLISTCYCLE_SOLUTION_H


#include <vector>
#include "string"


#include "unordered_map"
class Solution {
    std::unordered_map<int, int> memo;
public:
    Solution();
    ListNode* reverseList(ListNode* );
    int majorityElement(std::vector<int>& );

    std::string SaddBinary(std::string a, std::string b);
};

#endif //LINKEDLISTCYCLE_SOLUTION_H
