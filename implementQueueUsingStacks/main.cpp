#include <iostream>

#include "MyQueue.h"



int main() {
    MyQueue queue = MyQueue();
    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);
    queue.push(5);

    std::cout << queue.pop() << std::endl;
    std::cout << queue.peek() << std::endl;
    std::cout << queue.empty() << std::endl;
    std::cout << queue.pop() << std::endl;
    std::cout << queue.pop() << std::endl;
    std::cout << queue.pop() << std::endl;
    std::cout << queue.pop() << std::endl;
    std::cout << queue.peek() << std::endl;
    std::cout << queue.empty() << std::endl;


    std::cout << "Hello, World!" << std::endl;
    return 0;
}
