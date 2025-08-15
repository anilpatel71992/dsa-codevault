package com.dsa.codevault.array;

import java.util.Arrays;

/*
	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	Note that you must do this in-place without making a copy of the array.
	Example 1:
	Input: nums = [0,1,0,3,12]
	Output: [1,3,12,0,0]
			
	Example 2:
	Input: nums = [0]
	Output: [0]
	 
	Constraints:
	1 <= nums.length <= 104
	-231 <= nums[i] <= 231 - 1
*/
public class MoveZeroes {

	public static void main(String[] args) {
		moveZeroes(new int[] {0,1,0,3,12});
		System.out.println("");
		moveZeroes(new int[] {0});
	}
	
	public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0, i = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
            i++;
        }
        while(nonZeroIndex < nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        Arrays.stream(nums).forEach(val -> System.out.print(val + " "));
    }

}
