//
// Created by amz on 16/01/24.
//
// how to declare a stack in cpp?

#include <stack>
#include <iostream>
#include "MyQueue.h"


using namespace std;
    MyQueue::MyQueue() {

    forward_stack = stack<int>();
    reversed_stack = stack<int>();
    int current_peek;

    }

    void MyQueue::push(int x) {
        if (forward_stack.empty()) {
            current_peek = x;
        }
        forward_stack.push(x);
    }

    int MyQueue::pop() {
        while (!reversed_stack.empty()) {
            reversed_stack.pop();
        }

        while (!forward_stack.empty()) {
            reversed_stack.push(forward_stack.top());
            forward_stack.pop();
        }

        int value = reversed_stack.top();
        reversed_stack.pop();
        if (!reversed_stack.empty())
        current_peek = reversed_stack.top();

        while (!reversed_stack.empty()) {
            forward_stack.push(reversed_stack.top());
            reversed_stack.pop();
        }

        return value;
    }

    int MyQueue::peek() {
        return current_peek;
    }

    bool MyQueue::empty() {
        return forward_stack.empty();

    }
