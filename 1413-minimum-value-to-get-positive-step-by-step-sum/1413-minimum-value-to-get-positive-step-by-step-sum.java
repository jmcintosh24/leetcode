class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;
        
        while(true) {
            int sum = startValue;
            for(int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if(sum < 1)
                    break;
            }
            
            if(sum < 1)
                startValue++;
            else
                return startValue;
        }
    }
    
}