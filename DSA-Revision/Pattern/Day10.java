public class Day10 {
    public static void main(String args[]){
        int n = 5 ;
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<i+1 ; j++){
                System.out.print("*");
            }
            for(int k = 0 ; k<n - i - 1; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<n - i - 1; j++){
                System.out.print("*");
            }
            for(int k = 0 ; k<i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
