// /Permutations
///https://leetcode.com/problems/permutations/


/* 
import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int[] visited = new int[nums.length];
        permuteRec(nums, visited, new ArrayList(),ans);
        return ans;
    }
    
    public void permuteRec(int[] nums, int[] visited, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size() == visited.length){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i] == 0){
                visited[i] = 1;
                curr.add(nums[i]);
                permuteRec(nums,visited,curr, ans);
                visited[i] = 0;
                curr.remove(curr.size()-1);
            }
        }
    }
} */