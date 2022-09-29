//Paint Fence
//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-fence-official/ojquestion

import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    
    int ii = k*1;
    int ij = k*(k-1);
    int tot = ii+ij;
    
    for(int i = 3; i<=n ; i++){
      ii = ij *1;
      ij = tot*(k-1);
      
      tot = ii + ij;
    }
    System.out.println(tot);
    }
}