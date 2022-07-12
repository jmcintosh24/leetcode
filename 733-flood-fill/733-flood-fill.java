class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Stack<int[]> stack = new Stack<int[]>();
        int[] startingPair = {sr, sc};
        int origColor = image[sr][sc];
        stack.push(startingPair);
        
        if(origColor == color)
            return image;
        
        while(!stack.empty()) {
            int[] temp = stack.peek();
            int r = temp[0];
            int c = temp[1];
            image[r][c] = color;
            stack.pop();
            
            if(r - 1 >= 0 && image[r - 1][c] == origColor) {
                int[] newPair = {r - 1, c};
                stack.push(newPair);
            }
            
            if(c - 1 >= 0 && image[r][c - 1] == origColor) {
                int[] newPair = {r, c - 1};
                stack.push(newPair);
            }
            
            if(c + 1 < image[0].length && image[r][c + 1] == origColor) {
                int[] newPair = {r, c + 1};
                stack.push(newPair);
            }
            
            if(r + 1 < image.length && image[r + 1][c] == origColor) {
                int[] newPair = {r + 1, c};
                stack.push(newPair);
            }
            
            
        }
        
        return image;
    }
}