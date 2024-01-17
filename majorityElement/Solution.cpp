//
// Created by amz on 16/01/24.
//
// how to declare a stack in cpp?

#include <stack>
#include <iostream>
#include <unordered_map>
#include "ListNode.h"


#include "Solution.h"

#include <vector>

int Solution::majorityElement(std::vector<int>& nums) {
    int majority_number = 0;
    int number_of_accurence=0;
    for (int element : nums) {
        memo[element]++;
        if (memo[element] > number_of_accurence) {
            number_of_accurence = memo[element];
            majority_number = element;
        }
    }

    return majority_number;

    }

