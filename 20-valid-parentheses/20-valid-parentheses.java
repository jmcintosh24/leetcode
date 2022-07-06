class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == '[')
                stack.push(c);
            else if(c == ')') {
                if(!stack.empty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if(c == ']') {
                if(!stack.empty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
            else if(c == '}') {
                if(!stack.empty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
        }
        
        if(stack.empty())
            return true;
        else
            return false;
    }
}