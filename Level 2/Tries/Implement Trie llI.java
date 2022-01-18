//Implement Trie llI
// Leetcode 1804

//Coding Ninja 

public class Trie {
    public static class Node{
        private Node[] children = new Node[26];
        private int isEnd = 0;
        private int prefixCount = 0;
        
        public boolean contains(char ch){
            return (children[ch - 'a'] != null);
        }
        
        public Node get(char ch){
            return children[ch - 'a'];
        }
        
        public void set(char ch){
            children[ch - 'a'] = new Node();
        }
        
        public int getFreq(){
            return isEnd;
        }
        
        public int getPref(){
        	return prefixCount;    
        }
        
        public void increaseFreq(){
            isEnd++;
        }
        
        public void decreaseFreq(){
            isEnd--;
        }
        
        public void increasePref(){
            prefixCount++;
        }
        
        public void decreasePref(){
            prefixCount--;
        }
    }
    
    Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        
        for(int i=0; i<word.length(); i++){
            curr.increasePref();
            
            char ch = word.charAt(i);

            if(curr.contains(ch) == false)
                curr.set(ch);
        
            curr = curr.get(ch);
        }
        
        curr.increasePref();
        curr.increaseFreq();
    }

    public int countWordsEqualTo(String word) {
        Node curr = root;
        
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            if(curr.contains(ch) == false)
                return 0;
        
            curr = curr.get(ch);
        }
        
        return curr.getFreq();
    }

    public int countWordsStartingWith(String word) {
        Node curr = root;
        
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            if(curr.contains(ch) == false)
                return 0;
        
            curr = curr.get(ch);
        }
        
        return curr.getPref();
    }

    public void erase(String word) {
        if(countWordsEqualTo(word) == 0){
            return;
        }
        
        Node curr = root;
        
        for(int i=0; i<word.length(); i++){
            curr.decreasePref();
            char ch = word.charAt(i);
            curr = curr.get(ch);
        }
        
        curr.decreasePref();
        curr.decreaseFreq();
    }

}

/*Problem Statement
Ninja has to implement a data structure ”TRIE” from scratch. Ninja has to complete some functions.
1) Trie(): Ninja has to initialize the object of this “TRIE” data structure.

2) insert(“WORD”): Ninja has to insert the string “WORD”  into this “TRIE” data structure.

3) countWordsEqualTo(“WORD”): Ninja has to return how many times this “WORD” is present in this “TRIE”.

4) countWordsStartingWith(“PREFIX”): Ninjas have to return how many words are there in this “TRIE” that have the string “PREFIX” as a prefix.

5) erase(“WORD”): Ninja has to delete this string “WORD” from the “TRIE”.
Note:
1. If erase(“WORD”) function is called then it is guaranteed that the “WORD” is present in the “TRIE”.

2. If you are going to use variables with dynamic memory allocation then you need to release the memory associated with them at the end of your solution.
Can you help Ninja implement the "TRIE" data structure?
Input Format:
The first line contains a single integer “T” representing the number of test cases. 

The first line of each test case will contain a single integer “N” which denotes how many times the functions(as discussed above) will be called.

The next “N” lines contain the two space-separated strings, the first one is the name of the function and the second one is a “WORD”.
Output Format:
For each test case, complete all the functions as we discussed above.

The output for every test case will be printed in a separate line.
Note:
You do not need to print anything; it has already been taken care of. Just implement the given function.
Constraints:
1 <= “T” <= 50
1 <= “N” <= 10000
 “WORD” = {a to z}
1 <= | “WORD” | <= 1000

Where “T” is the number of test cases, “N” denotes how many times the functions(as discussed above) we call, “WORD” denotes the string on which we have to perform all the operations as we discussed above, and | “WORD” | denotes the length of the string “WORD”.

Time limit: 1 sec.
Sample Input 1:
1
5
insert coding
insert ninja
countWordsEqualTo coding
countWordsStartingWith nin
erase coding
Sample Output 1:
1
1   
Explanation Of Sample Input 1:
After insertion of “coding” in “TRIE”:*/