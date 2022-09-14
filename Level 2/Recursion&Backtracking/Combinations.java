//Combinations

// Box on level 

//https://leetcode.com/problems/combinations/

/* class Solution {
    public void combine(List<List<Integer>> combinations, 
        List<Integer> combination, int currentBox, int n, int k){
        if(currentBox == n){
            // pruning not opimised this time 
            if(combination.size() == k){
                // deep copy
                List<Integer> temp = new ArrayList<>(combination);
                combinations.add(temp);
            }
            return;
        }
        
        // options -> current Box -> item should be placed or not
        
        // yes
        combination.add(currentBox + 1);
        combine(combinations, combination, currentBox + 1, n, k);
        combination.remove(combination.size() - 1);
        
        // no
        combine(combinations, combination, currentBox + 1, n, k);
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        combine(combinations, combination, 0, n, k);
        return combinations;
    }
}
 */
/* 
// Items on Level
import java.io.*;
import java.util.*;

public class Main {

  public static void combinations(int[] boxes, int ci, int ti, int lastItemIdx){
    // write your code here
    if(ci == ti){
        for(int val: boxes){
            if(val == 0) System.out.print("-");
            else System.out.print("i");
        }
        
        System.out.println();
    }
    
    // Item -> Chose box
    for(int i=lastItemIdx + 1; i<boxes.length; i++){
        if(boxes[i] == 0){
            boxes[i] = ci + 1;
            combinations(boxes, ci + 1, ti, i);
            boxes[i] = 0;
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    combinations(new int[nboxes], 0, ritems, -1);
  }

} */

//////////////////////////////////////


/* class Solution {
    public void getCC(int start, int n, List<Integer> curr , List<List<Integer>> res , int k){
        
        if(curr.size() == k){
            res.add(new ArrayList(curr));//deepcopy 
            return;
        }
       
        
        for(int i = start ; i<=n ; i++){
            curr.add(i);
            getCC(i+1 , n , curr , res , k);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
          
        List<List<Integer>> res = new ArrayList<>();
        getCC(1 , n, new ArrayList<>() , res , k);
        return res;
    }
} */