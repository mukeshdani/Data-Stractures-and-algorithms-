//https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/

class Solution {
	// TC : O(n2)
	//SC : O(n)
	public boolean checkValid(int[][] matrix) {
		Set<Integer> set = null;

		for(int i = 0;i<matrix.length;i++){
			set = new HashSet<>();
			for(int j=0;j<matrix[0].length;j++){
				int el = matrix[i][j];
				if(set.contains(el)){
					return false;
				} else{
					set.add(el);
				}
			}
		}
		for(int i = 0;i<matrix[0].length;i++){
			set = new HashSet<>();
			for(int j=0;j<matrix.length;j++){


				int el = matrix[j][i];
				if(set.contains(el)){
					return false;
				} else{
					set.add(el);
				}
			}
		}

		return true;
	}
}


class Solution {
	// TC : O(n2)
	//SC : O(1)
	public boolean checkValid(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			int rowXor = 0;
			int colXor = 0;
			for (int j = 0; j < n; j++) {
				rowXor ^= matrix[i][j] ^ (j + 1);
				colXor ^= matrix[j][i] ^ (j + 1);
			}
			if (rowXor != 0 || colXor != 0)
				return false;
		}
		return true;

	}
}





/*2133. Check if Every Row and Column Contains All Numbers
Easy

164

11

Add to List

Share
An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

 

Example 1:


Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.
Example 2:


Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 100
1 <= matrix[i][j] <= n*/
