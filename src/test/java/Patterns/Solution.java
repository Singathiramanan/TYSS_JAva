package Patterns;

public class Solution {

	public int uniqueDigit(int[] nums) {
		int num=0;
		for(int i=0;i<nums.length;i++){
			int count=0;
			for(int j=0;j<nums.length;j++){
				if(nums[i]==nums[j]){
					count++;
				}
			}
			if(count==1){
				num = nums[i];
			}
		}
		return num;
	}

}
