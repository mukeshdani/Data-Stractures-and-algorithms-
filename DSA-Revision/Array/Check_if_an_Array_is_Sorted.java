public class Check_if_an_Array_is_Sorted {
    public static void main(String [] arg){
        //int array[] = {1,2,3,4,5};
        int array[] = {1,2,4,3,5};
        boolean isSorted = true;
        for(int i = 0 ; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("Is the array sorted? " + isSorted);
    }
}
