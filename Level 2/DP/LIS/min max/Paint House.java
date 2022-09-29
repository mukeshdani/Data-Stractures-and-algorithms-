
//Paint House
//https://pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-house-official/ojquestion


import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    
    int[][] arr = new int[n][3]
;

    for(int i = 0 ; i< n ; i++ ){
        
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
            arr[i][2] = scn.nextInt();
        
    }

        
        int r = arr[0][0];
        int g = arr[0][1];
        int b = arr[0][2];

  for(int i = 1 ; i<arr.length ; i++){
         int nr = arr[i][0] + Math.min(g,b);
         int ng = arr[i][1] + Math.min(b,r);
         int nb = arr[i][2] + Math.min(r,g);
         r = nr;
         g = ng;
         b= nb;
    }
    
    int ans = Math.min(r,Math.min(g,b));
    
    System.out.println(ans);
}
}







