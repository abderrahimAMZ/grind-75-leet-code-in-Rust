//
// Created by amz on 16/01/24.
//

#ifndef LINKEDLISTCYCLE_SOLUTION_H
#define LINKEDLISTCYCLE_SOLUTION_H

#include "ListNode.h"

/**
 * definition for singly-linked list.
 * struct listnode {
 *     int val;
 *     listnode *next;
 *     listnode(int x) : val(x), next(null) {}
 * };
 */

class Solution {
public:
    bool hasCycle(ListNode *head);
};



#endif //LINKEDLISTCYCLE_SOLUTION_H
