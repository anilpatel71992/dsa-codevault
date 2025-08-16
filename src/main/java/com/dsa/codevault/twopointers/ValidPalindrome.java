/*
	A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric 
	characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
	Given a string s, return true if it is a palindrome, or false otherwise.
	
	Example 1:
	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
	
	Example 2:
	Input: s = "race a car"
	Output: false
	Explanation: "raceacar" is not a palindrome.
	
	Example 3:
	Input: s = " "
	Output: true
	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	Since an empty string reads the same forward and backward, it is a palindrome.
	
	Constraints:
	1 <= s.length <= 2 * 105
	s consists only of printable ASCII characters.
 */
package com.dsa.codevault.twopointers;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome(" "));
	}
	
	public static boolean isPalindrome(String s) {
		int low = 0, high = s.length() - 1;
		while(low < high) {
			char left = s.charAt(low);
			if('A' <= left && left <= 'Z') left = (char)(left + 32);
			char right = s.charAt(high);
			if('A' <= right && right <= 'Z') right = (char)(right + 32);
			
			if(!(('a' <= left && left <= 'z') || ('0' <= left && left <= '9'))) {
				low++;
			} else if(!(('a' <= right && right <= 'z') || ('0' <= right && right <= '9'))) {
				high--;
			} else {
				if(left != right) return false;
				low++;
				high--;
			}
		}
		return true;
	}

}
