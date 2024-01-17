//
// Created by amz on 17/01/24.
//

#ifndef LINKEDLISTCYCLE_LISTNODE_H
#define LINKEDLISTCYCLE_LISTNODE_H

 struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };



#endif //LINKEDLISTCYCLE_LISTNODE_H
