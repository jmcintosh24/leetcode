class Solution {
    public String addBinary(String a, String b) {
        String answer = "";
        int i = 0;
        int aLen = a.length();
        int bLen = b.length();
        boolean carry = false;
        
        while(i < aLen || i < bLen) {
            int aNum;
            if(i < aLen) {
                char aChar = a.charAt(aLen - i - 1);
                aNum = aChar - '0';
            } else {
                aNum = 0;
            }
            
            int bNum;
            if(i < bLen) {
                char bChar = b.charAt(bLen - i - 1);
                bNum = bChar - '0';
            } else {
                bNum = 0;
            }
            
            int result = aNum + bNum;
            
            char temp;
            
            if(result == 2 && carry) {
                temp = '1';
            } else if(result == 2) {
                temp = '0';
                carry = true;
            } else if(result == 1 && carry) {
                temp = '0';
            } else if(result == 1) {
                temp = '1';
            } else if(carry) {
                temp = '1';
                carry = false;
            } else {
                temp = '0';
            }
            
            i++;
            
            answer = temp + answer;
        }
        
        if(carry) {
            answer = '1' + answer;
        }
        return answer;
        
    }
}