
//DiagonalMoveInMazzePath



import java.io.*;
import java.util.*;

public class Solution {
  
     static int count = 0;
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            // positve base case 
            count++;
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(sr>dr || sc>dc){
            // negative base case
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        ArrayList<String> rp = getMazePaths(sr, sc+1, dr, dc);
        for(String s:rp)
            ans.add("H" + s);
        ArrayList<String> vp = getMazePaths(sr+1, sc, dr, dc);
        for(String s:vp)
            ans.add("V" + s);
        ArrayList<String> dp = getMazePaths(sr+1, sc+1, dr, dc);
        for(String s:dp)
            ans.add("D" + s);
        return ans;
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        ArrayList<String> ans = getMazePaths(0, 0, m, n);
        System.out.println(count);
        System.out.println(ans);
         
        
        for ( int i = 0 ; i<ans.size() ; i++){
            System.out.println(ans.get(i));
        }
        
    }
}

/*Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and
columns on a rectangular board.

Our player starts in top-left corner of the board and must reach bottom-right
corner. In one move the player can move 1 step horizontally (right) or 1 step
vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the
player can travel across the board. Print the value returned.

b. Write a recursive function which returns an ArrayList of moves for all valid
paths across the board. Print the value returned.

c. Write a recursive function which prints moves for all valid paths across the
board (void is the return type for function).

Example(To be used only for expected output):
Input:
2 2
output

13
[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]
HHVV
HVHV
HVVH
HVD
HDV
VHHV
VHVH
VHD
VVHH
VDH
DHV
DVH
DD
Input Format

Integer Input

Constraints

1<= n <=1000000000

Output Format

print the output.

Sample Input 0

2 2
Sample Output 0

13
[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]
HHVV
HVHV
HVVH
HVD
HDV
VHHV
VHVH
VHD
VVHH
VDH
DHV
DVH
DD*/