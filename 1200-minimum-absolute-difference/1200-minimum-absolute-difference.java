class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            List<Integer> pair = new ArrayList<>();
            
            if(diff < minDiff) {
                minDiff = diff;
                list.clear();
            }
            
            if(diff == minDiff) {
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                list.add(pair);
            }
            
        }
        
        return list;
    }
}