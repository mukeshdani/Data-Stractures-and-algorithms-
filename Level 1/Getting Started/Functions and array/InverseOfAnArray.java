// Inverse Of An Array

/*

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to calculate the inverse of array a.

For definition and constraints check this link
https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number/ojquestion
The only difference is the range of values is from 0 to n - 1, instead of 1 to n.

Constraints

0 

Format

Input

Input is managed for you

Output

Output is managed for you

Example

Sample Input

5
4
0
2
3
1

Sample Output

1
4
2
3
0

*/

import java.io.*;
import java.util.*;

public class InverseOfAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int n=a.length ; 
    int[] b = new int[n];

    for(int i=0 ; i<n ; i++){
        int j = a[i];
        b[j]=i;
    }
    return b;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}