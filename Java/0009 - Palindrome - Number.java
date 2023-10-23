/*
    9. Palindrome Number ( https://leetcode.com/problems/palindrome-number )
        Given an integer x, return true if x is a palindrome, and false otherwise.
        Example 1:
            Input: x = 121
            Output: true
            Explanation: 121 reads as 121 from left to right and from right to left.
*/

class Solution {
    public boolean isPalindrome(int x) {
        int original, remainder, reversed = 0;
        original = x;

        while (x > 0){
            remainder = x % 10;
            reversed = reversed*10 + remainder;
            x /= 10;
        }

        if (reversed == original){
            return true;
        }else {
            return false;
        }
    }
}
