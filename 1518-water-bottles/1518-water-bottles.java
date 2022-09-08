class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numDrank = 0;
        int full = numBottles;
        int empty = 0;
        
        while(full + empty >= numExchange) {
            while(full > 0) {
                full--;
                empty++;
                numDrank++;
            }
            
            full = empty / numExchange;
            empty %= numExchange;
        }
        
        
        
        return numDrank + full;
    }
}