// Funny String

//Solution 
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<cstring>
using namespace std;


int main() {
  
    int t;
    cin>>t;
    while(t--)
        {
        char arr[10001],brr[10001];
        cin>>arr;
        int len=strlen(arr);
        int j=len-2;
        int i;
        for(i=1;i<len;i++,j--)
            {
            if(abs(arr[i]-arr[i-1])!=abs(arr[j]-arr[j+1]))
                {
                cout<<"Not Funny\n";
                break;
            }
        }
        if(i==len)
        cout<<"Funny\n";
        
    }
    return 0;
}




/*
In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g. . Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

Example

The ordinal values of the charcters are .  and the ordinals are . The absolute differences of the adjacent elements for both strings are , so the answer is Funny.

Function Description

Complete the funnyString function in the editor below.

funnyString has the following parameter(s):

string s: a string to test
Returns

string: either Funny or Not Funny
Input Format

The first line contains an integer , the number of queries.
The next  lines each contain a string, .
*/