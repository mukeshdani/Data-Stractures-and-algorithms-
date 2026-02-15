public class Day18 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0 ; i< n ; i++){
            //space
            for(int j = 0 ; j< n - i - 1; j++){
                System.out.print(" ");
            }
            //character
            for(int k = 0 ; k< i + 1; k++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            //character
            for(int m = i; m > 0; m--){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
            ch = 'A';
        }
    }
}
