public class Day15 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< n - i ; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}
