public class Count_Maximum_Consecutive_One_in_the_array {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,0,1,0,1};
        int maxOne = 0;
        int count = 0;
        for(int i = 0  ; i< arr.length ; i++){
            if(arr[i] ==1){
                count++;
            }else if(arr[i] == 0){
                if(count > maxOne){
                    maxOne = count;
                }
                count = 0;
            }
        }
        if(count > maxOne){
            maxOne = count;
        }
        System.out.println("The maximum consecutive one in the array is: " + maxOne);
    }
}
