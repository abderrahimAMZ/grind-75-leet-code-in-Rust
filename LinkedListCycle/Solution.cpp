//
// Created by amz on 16/01/24.
//

#include "ListNode.h"

#include <unordered_map>
using namespace std;
class Solution {

public:
    bool hasCycle(ListNode *head){
        ListNode* fast = head;
        ListNode* slow = head;
        while (fast != NULL && fast->next != NULL) {

            fast = fast->next->next;
            slow = slow->next;

            if (fast == slow) return true;

        }


        return false;
    }
};

};
