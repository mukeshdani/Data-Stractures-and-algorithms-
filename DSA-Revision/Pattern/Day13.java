public class Day13 {
    public static void main(String[] args){
        int n = 5;
        int count = 0;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j < i + 1; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
