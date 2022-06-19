//Intersection of Two Arrays II

//https://leetcode.com/problems/intersection-of-two-arrays-ii/


/* 
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i<nums1.length ; i++){
             hm.put(nums1[i], hm.getOrDefault(nums1[i],0)+1);
        }
        
        for(int i = 0 ; i<nums2.length; i++){
         if(hm.containsKey(nums2[i]) == true && hm.get(nums2[i]) > 0){
                list.add(nums2[i]);
                hm.put(nums2[i], hm.getOrDefault(nums2[i],0)-1);
            }
        }
        
         int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) result[i] = list.get(i);
        
        return result;
    }
}

*/