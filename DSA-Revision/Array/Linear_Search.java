public class Linear_Search {
    public static void main(String[] args){
        int arr[] = {2,5,1,3,0};
        int target = 3;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
