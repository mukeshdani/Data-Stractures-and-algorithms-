//StepArraySearch
// https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1


// Time = O(N) Linear Search Worst Case, O(N / K) Avg Case

// Using Jump Search Algorithm


class Complete{

    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int target, int jump) {
        //Complete the function
        int idx = 0;
        
        while(idx<n){
            
            if(arr[idx] == target)return idx;
            
            int requiredJump = Math.abs(arr[idx]  - target);
            int minJump  = requiredJump /  jump;// floor division
            if(requiredJump % jump !=0)minJump++;//ceil division
            
            idx = idx + minJump;
        }
          return -1;
    } 
}