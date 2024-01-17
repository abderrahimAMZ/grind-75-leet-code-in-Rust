//
// Created by amz on 16/01/24.
//
// how to declare a stack in cpp?

#include <stack>
#include <iostream>
#include <unordered_map>
#include "ListNode.h"


#include "Solution.h"
ListNode* Solution::reverseList(ListNode* head) {
    if (head == nullptr || head->next == nullptr) {
        return head;

    }
    ListNode* p = reverseList(head->next);

    head->next->next = head;
    head->next = nullptr;
    return p;

        }
