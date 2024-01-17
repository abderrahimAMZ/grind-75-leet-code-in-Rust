//
// Created by amz on 16/01/24.
//
// how to declare a stack in cpp?

#include <stack>
#include <iostream>
#include <unordered_map>


using namespace std;
class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        std::unordered_map<char, int> map;
        for (char c : magazine) {
            map[c]++;
        }
        for (char c : ransomNote) {
            if (map[c] == 0) {
                return false;
            }
            map[c]--;
        }
        return true;
    }
};