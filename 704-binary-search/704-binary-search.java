class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        int mid = (end + start) / 2;
        
        if(nums[start] == target)
            return start;
        else if(nums[end] == target)
            return end;
        
        while(start < end - 1) {
            if(target < nums[mid]) 
                end = mid;
            else if(target > nums[mid])
                start = mid;
            else
                return mid;
            mid = (end + start) / 2;
        }
        
        return -1;
    }
}