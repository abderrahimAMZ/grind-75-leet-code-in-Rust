//
// Created by amz on 16/01/24.
//

#ifndef LINKEDLISTCYCLE_LISTNODE_H
#define LINKEDLISTCYCLE_LISTNODE_H


#include <clocale>

struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
 };

#endif //LINKEDLISTCYCLE_LISTNODE_H
