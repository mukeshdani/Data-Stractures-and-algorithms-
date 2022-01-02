//Two Sum III - Data structure design
//https://www.lintcode.com/problem/607/

public class TwoSum {
    ArrayList<Integer> data ;

    boolean isSorted;
    public TwoSum(){
        data = new ArrayList<>();
        isSorted = false ;
    }

    public void add(int number) {
       data.add(number);
       isSorted = false ;
    }

   
    public boolean find(int value) {
       if ( isSorted == false){
           Collections.sort(data);
           isSorted = true ;
       }

       int left = 0 , right = data.size()-1;

       while(left<right){
           int sum = data.get(left) + data.get(right);
           if ( sum == value) return true;
           if ( sum<value) left++;
           else right--;
       }
       return false ;
    }
}

// best Approach 
// using HashMap
public class TwoSum {
    HashMap<Integer , Integer> freq;

  public TwoSum(){
     freq = new HashMap<>();
  }
  public void add(int number) {
     freq .put(number , freq.getOrDefault(number , 0 )+1);
  }

 
  public boolean find(int value) {
     for ( Integer key: freq.keySet()){
        int comp = value-key;
        int freq_comp = freq.getOrDefault(comp  ,0);
     
     if (value - key == key){
         if ( freq_comp>=2)return true;
     }else {
         if ( freq_comp>=1) return true;
     }
     }
     return false ;
  }
}

/*Description
Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

Example
Example 1:

add(1); add(3); add(5);
find(4) // return true
find(7) // return false*/