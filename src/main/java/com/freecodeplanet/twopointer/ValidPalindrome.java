package com.freecodeplanet.twopointer;

// Valid Palindrome leetcode 125
// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// Description: https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
