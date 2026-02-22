public class Day21 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i < n ; i++){
            //star
            for(int j = 0 ; j< i+1; j++){
                System.out.print("* ");
            }
            //space
            for(int k = 0 ; k< 2*n - 2*(i+1); k++){
                System.out.print("  ");
            }
            //star
            for(int j = 0 ; j< i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
