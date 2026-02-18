public class Left_Rotated_an_Array_By_D {
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bruitForce(int arr[], int d){
        while(d>0){
            for(int i = 0, j = 1; i< arr.length; i++){
                if(i == arr.length - 1){
                    break;
                }
                swap(arr,i,j);
                j++;
            }
            d--;
        }
    }
    public static void optimalApproach(int arr[], int d) {
        int n = arr.length;
        int temp[] = new int[d];

        // Step 1: Copy first d elements into temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        int first = 0;
        int second = d;

        // Step 2: Shift elements left by swapping
        while (second < n) {
            arr[first] = arr[second];
            first++;
            second++;
        }

        // Step 3: Put temp[] elements at the end
        for (int i = 0; i < d; i++) {
            arr[first + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int d = 10;
        d=d%arr.length;
        //bruitForce(arr, d);
        optimalApproach(arr, d);
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
