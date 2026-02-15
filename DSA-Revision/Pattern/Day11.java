public class Day11 {
    public static void main(String args[]){
        int n = 5;
        int flag = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j< i  + 1; j++){
                if(flag == 1){
                    System.out.print("1" + ' ');
                    flag = 0;
                }else{
                    System.out.print("0" + ' ');
                     flag = 1;
                }
            }
            System.out.println();
        }
    }
}
