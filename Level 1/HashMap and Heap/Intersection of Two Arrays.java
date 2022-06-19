//Intersection of Two Arrays
//https://leetcode.com/problems/intersection-of-two-arrays/


/* 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i<nums1.length ; i++){
            hm.put(nums1[i],hm.get(nums1[i] + 1) );
        }
        
        for(int i = 0 ; i<nums2.length; i++){
            if(hm.containsKey(nums2[i])){
                list.add(nums2[i]);
                hm.remove(nums2[i]);
            }
        }
        
         int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) result[i] = list.get(i);
        
        return result;
    }
}*/