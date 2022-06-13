class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        
        //find the shortest length in the array
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        
        //loop through the array that many times
        for(int i = 0; i < min; i++) {
            char curr = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != curr) {
                    return prefix;
                }
            }
            prefix += curr;
        }
        return prefix;
    }
}