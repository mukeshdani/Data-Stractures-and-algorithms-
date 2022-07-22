//Maximum Swap


class Solution {
    public int maximumSwap(int num) {
        char[] arr = (num + "").toCharArray();

        int[] right = new int[arr.length];
        for(int i = arr.length - 2; i >= 0; i--){
            if(i == arr.length - 1){
                right[i] = -1;
            } else if(i == arr.length - 2){
                right[i] = arr.length - 1;
            } else {
                if(arr[i + 1] > arr[right[i + 1]]){
                    right[i] = i + 1;
                } else {
                    right[i] = right[i + 1];
                }
            }
        }

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[right[i]]){
                char temp = arr[i];
                arr[i] = arr[right[i]];
                arr[right[i]] = temp;
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}