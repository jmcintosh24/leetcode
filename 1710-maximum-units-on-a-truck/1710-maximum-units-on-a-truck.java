class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //Sort in descending order
        for(int i = 0; i < boxTypes.length - 1; i++) {
            for(int j = i + 1; j < boxTypes.length; j++) {
                if(boxTypes[j][1] > boxTypes[i][1]) {
                    int[] temp = boxTypes[j];
                    boxTypes[j] = boxTypes[i];
                    boxTypes[i] = temp;
                }
            }
        }
        
        int boxes = 0;
        int units = 0;
        
        for(int i = 0; i < boxTypes.length; i++) {
            for(int j = 0; j < boxTypes[i][0]; j++) {
                if(boxes == truckSize)
                    return units;
                units += boxTypes[i][1];
                boxes++;
            }
        }
        
        return units;
    }
}