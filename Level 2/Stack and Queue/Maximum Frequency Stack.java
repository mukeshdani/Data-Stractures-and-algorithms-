//Maximum Frequency Stack
//https://leetcode.com/problems/maximum-frequency-stack/


class FreqStack {

    HashMap<Integer, Integer> freq = new HashMap<>();
    HashMap<Integer , ArrayList<Integer>> freqNodes = new HashMap<>();
    
    int maxFreq = 0 ;
    
    public void push(int val) {
        //Increase Valse in frequency 
        freq.put(val , freq.getOrDefault(val , 0) + 1 );
        int currFreq = freq.get(val);
        
        if ( freqNodes.containsKey(currFreq) == false ){
            freqNodes.put(currFreq , new ArrayList<>());
        }
        
        freqNodes.get(currFreq).add(val);
        if(currFreq > maxFreq) maxFreq = currFreq;
    }
    
    public int pop() {
        ArrayList<Integer> nodes = freqNodes.get(maxFreq);
        
        int val = nodes.get(nodes.size() -1 );
        
        nodes.remove(nodes.size() -1 );
        freq.put(val , freq.get(val) -1);
        
        if ( nodes.size () == 0 ){
            freqNodes.remove(maxFreq);
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */