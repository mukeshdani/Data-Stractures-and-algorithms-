//Design Add and Search Words Data Structure
class WordDictionary {
    public static class Node{
        private Node[] children = new Node[26];
        private boolean isEnd = false;
        
        public Node get(char ch){
            return children[ch - 'a'];
        }
        
        public boolean getEnd(){
            return isEnd;    
        }
        
        public void setEnd(){
            isEnd = true;
        }
        
        public void add(char ch){
            children[ch - 'a'] = new Node();
        }
        
        public boolean contains(char ch){
            return (children[ch - 'a'] != null);
        }
    }
    
    Node root;
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            
            if(curr.contains(ch) == false)
                curr.add(ch);
            
            curr = curr.get(ch);
        }
        curr.setEnd();
    }
    
    public boolean search(String word, int idx, Node curr){
        if(idx == word.length()){
            return curr.getEnd();
        }
        
        char ch = word.charAt(idx);
        
        if(ch != '.'){
            if(curr.contains(ch) == false) return false;
            return search(word, idx + 1, curr.get(ch));
        }
        
        for(char chn = 'a'; chn <= 'z'; chn++){
            if(curr.contains(chn) == false) continue;
            
            if(search(word, idx + 1, curr.get(chn))) 
                return true;
        }
        
        return false;
    }
    
    public boolean search(String word) {
        return search(word, 0, root);
    }
}

/*Design a data structure that supports adding new words and finding if a string matches any previously added string.

Implement the WordDictionary class:

WordDictionary() Initializes the object.
void addWord(word) Adds word to the data structure, it can be matched later.
bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 

Example:

Input
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
Output
[null,null,null,null,false,true,true,true]

Explanation
WordDictionary wordDictionary = new WordDictionary();
wordDictionary.addWord("bad");
wordDictionary.addWord("dad");
wordDictionary.addWord("mad");
wordDictionary.search("pad"); // return False
wordDictionary.search("bad"); // return True
wordDictionary.search(".ad"); // return True
wordDictionary.search("b.."); // return True
 

Constraints:

1 <= word.length <= 500
word in addWord consists lower-case English letters.
word in search consist of  '.' or lower-case English letters.
At most 50000 calls will be made to addWord and search.*/
