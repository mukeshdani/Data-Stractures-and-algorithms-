

//Distinct Occurrences


import java.io.*;
import java.util.*;

public class DistinctOccurrences{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        
        int[] arr = new int [n];
        for ( int i =0 ; i< n ; i++){
            
            arr[i]=scn.nextInt();
        }
        
        
        
        System.out.println(uniqueOccurrences(arr));
        
    }
    
   public static  boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int i:arr){
            int count=map.containsKey(i)?map.get(i):0;
            map.put(i,count+1);
        }
       
        for(Integer i: map.values()){
            set.add(i);
        }
        
            return set.size()==map.size();
    }
}

/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Input Format

First line of each test case takes an integer n, size of an array.
Second line of each test case receives an array arr.
Constraints

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
Output Format

Return true or false acc. to desired output.
Sample Input 0

6
1 2 2 1 1 3
Sample Output 0

true
Explanation 0

The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Sample Input 1

2
1 2
Sample Output 1

false
Sample Input 2

10
-3,0,1,-3,1,1,1,-3,10,0
Sample Output 2

true
*/