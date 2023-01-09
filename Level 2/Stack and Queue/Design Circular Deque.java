//Design Circular Deque
//https://leetcode.com/problems/design-circular-deque/


class MyCircularDeque {

    
    int []arr;
   int front , rear , size ;
   public MyCircularDeque(int k) {
       arr = new int [k];
       
       front = rear = size = 0 ;
   }
   public boolean insertFront(int value) {
       if (isFull()){
           return false ;
           // Deque  overflow 
       }
       if ( size == 0) front = rear = 0 ;
       else front = (front-1 + arr.length )%arr.length ;
       
       arr[front] = value ;
       size ++ ;
       return true ;
       
   }
   
   public boolean insertLast(int value) {
       if ( isFull()){
           return false ;
           // Deque overflow 
       }
       
       if ( size== 0 )front = rear = 0 ;
       else rear = (rear+1)%arr.length ;
       
       
       arr[rear] = value ;
       size ++ ;
       return true ;
   }
   
   public boolean deleteFront() {
       if ( isEmpty()){
           // Deque Underflow 
           return false ;
       }
       
       front  = (front + 1) % arr.length ;
       size-- ;
       return true ;
   }
   
   public boolean deleteLast() {
       if ( isEmpty()){
           return false ;
           //Underflow 
       }
       
       rear = (rear-1 +arr.length )%arr.length ;
       size --;
       return true ;
   }
   
   public int getFront() {
       if ( isEmpty()){
           return -1 ;
       }
       
       return arr[front];
   }
   
   public int getRear() {
       if ( isEmpty()){
           return -1 ;
       }
       
       return arr[rear];
   }
   
   public boolean isEmpty() {
       return size ==0 ;
   }
   
   public boolean isFull() {
       return size == arr.length ;
   }
}

/**
* Your MyCircularDeque object will be instantiated and called as such:
* MyCircularDeque obj = new MyCircularDeque(k);
* boolean param_1 = obj.insertFront(value);
* boolean param_2 = obj.insertLast(value);
* boolean param_3 = obj.deleteFront();
* boolean param_4 = obj.deleteLast();
* int param_5 = obj.getFront();
* int param_6 = obj.getRear();
* boolean param_7 = obj.isEmpty();
* boolean param_8 = obj.isFull();
*/