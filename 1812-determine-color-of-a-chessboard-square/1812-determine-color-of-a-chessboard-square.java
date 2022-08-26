class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0) - 'a';
        int num = coordinates.charAt(1) - '0';
        
        if(num % 2 == 0) {
            if(letter % 2 == 0)
                return true;
            else
                return false;
        } else {
            if(letter % 2 == 0)
                return false;
            else
                return true;
        }
    }
}