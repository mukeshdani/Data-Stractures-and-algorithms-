public class Left_Rotate_the_Array_by_One {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int arr[] = {1,2,34,56,55};
        for(int i = 0, j = 1; i<arr.length ; i++){
            if(i == arr.length - 1){
                break;
            }
            swap(arr, i, j);
            j++;
        }

        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
