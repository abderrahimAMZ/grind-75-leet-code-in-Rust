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
#include <string>


std::string Solution::SaddBinary(std::string a, std::string b) {
    std::string result;
    int carry = 0;
    int i = a.size() -1;
    int j = b.size() -1;
    while (i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if (i >= 0) {
            sum += a[i--] - '0';
        }
        if (j >= 0) {
            sum += b[j--] - '0';
        }

        carry = sum / 2;
        sum = sum % 2;
        result += sum + '0';
    }
    std::reverse(result.begin(), result.end());
    return result;


}
