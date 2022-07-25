//K largest elements 
//https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1
/* 

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i< n ; i++){
            if( i< k ){
                pq.add(arr[i]);
            }else if(pq.peek() < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(pq.size()> 0){
            res.add(pq.remove());
        }
        
        Collections.reverse(res);
        return res;
    }
}
 */





// Approach 2 



/* class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i< n ; i++){
           pq.add(arr[i]);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(res.size()< k){
            res.add(pq.remove());
        }
        
      
        return res;
    }
}  */



// Quick Select 
//Average - TC-> O(N)
// wrost TC -> (N^2)

class Solution {
        
    public int partition(int[] arr, int l, int r){
      int j = l;
      for(int i=l; i<=r; i++){
          if(arr[i] <= arr[r]){
              int temp = arr[j];
              arr[j] = arr[i];
              arr[i] = temp;
              j++;
          }
      }
      return j - 1;
  }
  
  public int quickSelect(int[] arr, int l, int r, int k){
      if(l == r) return arr[l];
      
      int pivot = partition(arr, l, r);
      if(pivot == arr.length - k) return arr[pivot];
      if(pivot > arr.length - k) return quickSelect(arr, l, pivot - 1, k);
      return quickSelect(arr, pivot + 1, r, k);
  }
  
  public int findKthLargest(int[] arr, int k) {
      return quickSelect(arr, 0, arr.length - 1, k);
  }
  }

