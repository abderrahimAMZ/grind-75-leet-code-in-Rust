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

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

ListNode* Solution::middleNode(ListNode* head) {
    ListNode* fast = head;
    ListNode* slow = head;
    while (true){
        if (fast == nullptr || fast->next == nullptr){
            return slow;
        }

        fast = fast->next->next;
        slow = slow->next;
    }
    return slow;
}