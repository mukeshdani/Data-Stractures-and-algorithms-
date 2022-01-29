//Design Front Middle Back Queue
//https://leetcode.com/problems/design-front-middle-back-queue/

// 1. Using Linked List 
class FrontMiddleBackQueue {
    LinkedList <Integer> link ;
  public FrontMiddleBackQueue() {
      link = new LinkedList();
  }
  
  public void pushFront(int val) {
      link.addFirst(val);
  }
  
  public void pushMiddle(int val) {
      link.add(link.size()/2 , val);
  }
  
  public void pushBack(int val) {
      link.addLast(val);
  }
  
  public int popFront() {
      return link.isEmpty()?-1:link.removeFirst();
  }
  
  public int popMiddle() {
      return link.isEmpty()?-1:link.remove((link.size()-1)/2);
  }
  
  public int popBack() {
       return link.isEmpty()?-1:link.removeLast();
  }
}


// Using Deque

/*
Used two deques to implement this problem.

First Queue :- When you call pushFront(), it will be adding to the start of the first queue. So now popFront() is easy just need to return first element from the first queue if exists otherwise return first element from the second queue.

Second Queue:- When you call pushBack(), it will be adding to the end of the second queue. So now popBack() is easy just need to return last element from the second queue if exists otherwise return last element from the first queue.

Now we are left with pushMiddle() and popMiddle(), on every call to these methods try to maintain equal number of elements on both the deques by shifting elements from first deque to second deque in case middle index falls in the first deque and same applies to the other case as well and then finally insert the value.*/

class FrontMiddleBackQueue {

    Deque<Integer> left = new ArrayDeque<>();
    Deque<Integer> right = new ArrayDeque<>();
    public void balance() {
        if ( (left.size() + right.size())%2 == 0 ){
            while ( left.size()> right.size()){
               int val = left.removeLast();
                right.addFirst(val);
            }
            while(right.size() > left.size()){
                int val = right.removeFirst();
                left.addLast(val);
            }
        }else {
            while(left.size()> right.size()+1){
                int val = left.removeLast();
                right.addFirst(val);
            }
            while(right.size()+1 > left.size()){
                int val = right.removeFirst();
                left.addLast(val);
            }
        }
    }
    
    public void pushFront(int val) {
         left.addFirst(val);
        balance();
    }
    
    public void pushMiddle(int val) {
        if(left.size()>right.size()){
            right.addFirst(left.getLast());
            left.removeLast();
        }
        
        left.addLast(val);
        balance();
    }
    
    public void pushBack(int val) {
        right.addLast(val);
        balance();
    }
    
    public int popFront() {
        if(left.size()+ right.size() == 0)return -1;
       int val = left.getFirst();
        left.removeFirst();
        balance();
        return val;
    }
    
    public int popMiddle() {
        if(left.size() + right.size() == 0 )return -1 ;
        
            int val = left.getLast();
            left.removeLast();
            balance();
            return val;
        
    }
    
    public int popBack() {
        if ( right.size() + left.size() == 0 ) return -1 ;
        if ( right.size() == 0){
            int val = left.getLast();
            left.removeLast();
            balance();
            return val;
        }else {
            int val = right.getLast();
            right.removeLast();
            balance();
            return val;
        }
    }
}
