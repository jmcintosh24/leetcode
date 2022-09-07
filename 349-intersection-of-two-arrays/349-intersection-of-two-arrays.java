class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        
        for(int i: nums1)
            s1.add(i);
        
        Set<Integer> s2 = new HashSet<>();
        
        for(int i: nums2)
            s2.add(i);
        
        s1.retainAll(s2);
        
        int[] array = new int[s1.size()];
        int count = 0;
        
        for(Integer i: s1) {
            array[count] = i;
            count++;
        }
        
        return array;
    }
}