public class Day12 {
    public static void main (String[] args){
        int n = 4;
        for(int i = 0 ; i<n;i++ ){
            for(int j = 0 ; j< i + 1; j++){
                System.out.print(j + 1 + " ");
            }
            for(int k = 0 ; k < 2*n - (2*i + 2); k++){
                System.out.print("  ");
            }
            for(int l = i + 1; l > 0; l--){
                System.out.print(l + " ");
            }
            System.out.println();
        }
        
    }
}
