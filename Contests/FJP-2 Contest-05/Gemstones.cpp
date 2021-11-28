//Gemstones

#include <bits/stdc++.h>


using namespace std;
string s[101];
int main()
{
    ios::sync_with_stdio(0);
    int n;
    cin >> n;
    for(int i = 0 ; i < n ; ++i)
        cin >> s[i];
    
    int ans = 0;
    for(char ch = 'a' ; ch <= 'z' ; ++ch)
    {
        bool fl = 1;
        for(int i = 0 ; fl && i < n ; ++i)
        {
            fl = 0;
            for(int j = 0 ; j < s[i].size() ; ++j)
            if(s[i][j] == ch)
                fl = 1;
        }
        if(fl)
            ++ans;
    }
    cout << ans << "\n";
    return 0;
}


/*
There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range . There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.
*/