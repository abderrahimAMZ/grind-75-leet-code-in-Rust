//
// Created by amz on 16/01/24.
//

#ifndef LINKEDLISTCYCLE_MYQUEUE_H
#define LINKEDLISTCYCLE_MYQUEUE_H


/**
 * definition for singly-linked list.
 * struct listnode {
 *     int val;
 *     listnode *next;
 *     listnode(int x) : val(x), next(null) {}
 * };
 */
#include <stack>
#include <iostream>


class MyQueue {
    std::stack<int> forward_stack;
    std::stack<int> reversed_stack;
    int current_peek;
public:
    MyQueue();

    void push(int x);

    int pop();

    int peek();

    bool empty();
};



#endif //LINKEDLISTCYCLE_MYQUEUE_H
