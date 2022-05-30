//Brothers From Different Roots
//https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1


class Solution
{
    
    public static void inOrder(Node root , ArrayList<Integer> list){
        if(root == null)return ;
        
        inOrder(root.left , list);
        list.add(root.data);
        inOrder(root.right , list);
    }
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		
		ArrayList<Integer> n1 = new ArrayList<>();
		ArrayList<Integer> n2 = new ArrayList<>();
		
		inOrder(root1 , n1);
		inOrder(root2 , n2);
		
		int i = 0 ;
		int j = n2.size()-1;
		int count = 0 ;
		
		while(i<n1.size()&& j>=0){
		    int sum = n1.get(i) + n2.get(j);
		    
		    if(sum == x){
		        count++;
		        i++;
		        j--;
		    }else if(sum < x){
		        i++;
		    }else {
		        j--;
		    }
		}
		return count;
	}
}