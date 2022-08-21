class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int firstSum = 0;
            int secondSum = 0;
            for(int j = 0; j < nums.length; j++) {
                if(j < i)
                    firstSum += nums[j];
                else if(j > i)
                    secondSum += nums[j];
            }
            if(firstSum == secondSum)
                return i;
        }
        return -1;
    }
}