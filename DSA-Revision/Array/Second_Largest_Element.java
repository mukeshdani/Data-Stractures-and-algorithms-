public class Second_Largest_Element {
    public static void main(String[] args) {
        int arr[] = {2,5,6,7,8,9};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondMax);
}
}
