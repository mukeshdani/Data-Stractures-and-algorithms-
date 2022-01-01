//78. Subsets

class Solution {
    
    public List<List<Integer>> subsets(int[] nums , int idx){
        if ( idx == nums.length){
            List<List<Integer>> bres = new ArrayList<>();
            bres.add(new ArrayList<>());
            return bres;
        }
        
        List<List<Integer>> tres = subsets(nums , idx + 1);
        List<List<Integer>> res = new ArrayList<>();
        
        for ( List<Integer> subSet:tres){
            // newSubset--> yes choise 
            
            List<Integer>  newSubset = new ArrayList<>();
            newSubset.add(nums[idx]);
            
            for (Integer i : subSet){
                newSubset.add(i);
            }
            res.add(newSubset);
            
            //subSet ----> no choises 
            
            res.add(subSet);
        }
        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        return subsets(nums , 0);
    }
}


/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.*/
