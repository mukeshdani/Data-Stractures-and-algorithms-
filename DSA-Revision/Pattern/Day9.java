public class Day9 {
    public static void main(String args[]){
        int n = 5;
        for(int i = 0 ; i < n ; i++){
            //spaces
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            //stars
            for(int k = 0 ; k < 2*i + 1 ; k++){
                System.out.print("*");
            }
            //spaces
            for(int l = 0 ; l < n - i - 1 ; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n ; i++){
            //spaces
            for(int j = 0 ; j <i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int k = 0 ; k < 2*n - (2*i + 1) ; k++){
                System.out.print("*");
            }
            //spaces
            for(int l = 0 ; l <i ; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
