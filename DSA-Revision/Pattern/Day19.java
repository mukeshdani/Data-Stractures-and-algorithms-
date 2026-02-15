public class Day19 {
    public static void main(String[] args) {
        int n = 5;
        char ch = (char) ('A' + n - 1);
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j <i+1 ; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();   
            ch = (char) ('A' + (n - i - 2));
        }
    }
}
