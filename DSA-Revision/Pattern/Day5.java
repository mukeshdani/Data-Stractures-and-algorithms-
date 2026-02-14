public class Day5 {
    

    public static void main(String[] args) {
        int n = 4;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< n - i; j++){
                System.out.print(j+1+ " ");
            }
            System.err.println("");
        } 

    }
}
