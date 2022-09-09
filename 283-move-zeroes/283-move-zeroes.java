class Solution {
    public void moveZeroes(int[] nums) {
        int numZeroes = 0;
        int start = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && start == -1) {
                numZeroes++;
                start = i;
            } else if(nums[i] == 0) {
                numZeroes++;
            } else {
                if(numZeroes > 0) {
                    int temp = nums[i];
                    nums[i] = 0;
                    nums[start] = temp;
                    start++;
                }
            }
        }
    }
}