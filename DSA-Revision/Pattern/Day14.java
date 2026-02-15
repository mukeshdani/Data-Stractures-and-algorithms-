public class Day14 {
    public static void main(String[] args) {
        int n = 5;;
        char ch = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i + 1; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}
