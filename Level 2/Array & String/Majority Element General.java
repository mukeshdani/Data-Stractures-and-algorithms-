//Majority Element General
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/majority-element-general/ojquestion

/* 
public static ArrayList<Integer> majorityElement(int[] arr, int k) {
    // write yout code here
     int n = arr.length ;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i = 0 ; i<n  ; i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i] , map.get(arr[i]) + 1);
        }else {
            map.put(arr[i],1);
        }
    }
    
    ArrayList<Integer> res = new ArrayList<>();
    
    for(int key : map.keySet()){
        if(map.get(key) > n/k){
            res.add(key);
        }
    }
    return res;
}
 */