//Game of Thrones - I

#include<iostream>
#include<string>
using namespace std;

int cnt[26];

int main()
{
 string str;
 cin >> str;
 for (int i = 0; i < (int)str.size(); i++)
  cnt[str[i] - 'a']++;
 int even = 0, odd = 0;
 for (int i = 0; i < 26; i++)
 {
  if (cnt[i] % 2 == 0) even++;
  else odd++;
 }

 if (odd <= 1)
  cout << "YES" << endl;
 else
  cout << "NO" << endl;

 return 0;
}


/*
Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

door

But, to lock the door he needs a key that is an anagram of a palindrome. He starts to go through his box of strings, checking to see if they can be rearranged into a palindrome. Given a string, determine if it can be rearranged into a palindrome. Return the string YES or NO.

Example
*/