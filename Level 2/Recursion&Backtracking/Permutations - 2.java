//Permutations - 2
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutations-ii-official/ojquestion



// box on Level
/*import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(int currentBox, int n, int k, boolean[] itemPlaced, String boxes, int itemsPlacedCount){
      if(currentBox == n){
          if(itemsPlacedCount == k){
              System.out.println(boxes);
          }
          return;
      }
      
      
      for(int i=0; i<k; i++){
          if(itemPlaced[i] == false){
              itemPlaced[i] = true;
              permutations(currentBox + 1, n, k, itemPlaced, boxes + (i + 1), itemsPlacedCount + 1);
              itemPlaced[i] = false;
          }
      }
      
      // currentBox -> Do not place any element
      permutations(currentBox + 1, n, k, itemPlaced, boxes + 0, itemsPlacedCount);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    
    String boxes = "";
    boolean[] itemPlaced = new boolean[k];
    permutations(0, n, k, itemPlaced, boxes, 0);
  }

}

*/
// Item on Level
import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(int[] boxes, int ci, int ti){
    // write your code here
    if(ci == ti){
        for(int val: boxes) System.out.print(val);
        System.out.println();
    }
    
    // Item -> Chose box
    for(int i=0; i<boxes.length; i++){
        if(boxes[i] == 0){
            boxes[i] = ci + 1;
            permutations(boxes, ci + 1, ti);
            boxes[i] = 0;
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(new int[nboxes], 0, ritems);
  }

}

