//Find the Largest element in an array

public class Find_the_largest_element_in_an_array {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 0};
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}