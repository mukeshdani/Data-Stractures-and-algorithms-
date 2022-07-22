//Car Pooling
//
//https://leetcode.com/problems/car-pooling/

/* class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> stops = new ArrayList<>();
        
        for( int [] trip : trips){
            int people = trip[0];
            int from = trip[1];
            int to = trip[2];
            
            if(map.containsKey(from) == false ){
                map.put(from , +people);
                stops.add(from);
            }else {
                map.put(from , map.get(from) + people);
            }
            
              if(map.containsKey(to) == false ){
                map.put(to, -people);
                stops.add(to);
            }else {
                map.put(to , map.get(to) - people);
            }
        }
        
        Collections.sort(stops);
        int pic = 0 ;
        for(int stop : stops){
            int delta = map.get(stop);
            pic +=delta;
            
            if(pic > capacity){
                return false ;
            }
        }
        return true;
    }
} */