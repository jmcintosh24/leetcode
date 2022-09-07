class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String sub = "";
        
        for(int start = 0; start < s.length(); start++) {
            char c = s.charAt(start);
            while(sub.indexOf(c) > -1) {
                if(sub.length() > 1)
                    sub = sub.substring(1, sub.length());
                else
                    sub = "";
            }
            sub += c;
            if(sub.length() > maxLength)
                maxLength = sub.length();
        }
        
        return maxLength;
    }
}