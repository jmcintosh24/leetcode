class Solution {
    public boolean isPalindrome(String s) {
        //Clean up input string
        String clean = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
                clean += c;
        }
        clean = clean.toLowerCase();
        
        //Check for palindrome
        for(int i = 0; i < clean.length(); i++) {
            if(clean.charAt(i) != clean.charAt(clean.length() - i - 1))
                return false;
        }
        
        return true;
    }
}