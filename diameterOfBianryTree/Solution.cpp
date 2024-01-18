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

int height(TreeNode* root) {
    if (root == nullptr) {
        return 0;
    }
    return std::max(height(root->left), height(root->right)) + 1;
}


int diameterOfBinaryTree(TreeNode* root) {
    if (root == nullptr) {
        return 0;
    }
    int left = diameterOfBinaryTree(root->left);
    int right = diameterOfBinaryTree(root->right);
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);
    return std::max(std::max(left, right), leftHeight + rightHeight);

}