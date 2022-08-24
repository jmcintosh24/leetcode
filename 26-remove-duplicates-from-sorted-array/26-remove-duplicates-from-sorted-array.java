class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int current = nums[0] - 1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != current) {
                current = nums[i];
                nums[count] = current;
                count++;
            }
        }
        return count;
    }
}