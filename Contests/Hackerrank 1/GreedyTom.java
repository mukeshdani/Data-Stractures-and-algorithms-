//Tom is a little cat. But despite the fact he is still a kitten he already knows about the pretty things that coins are. He knows that for every coin he can get very tasty bone from his master. He believes that some day he will find a treasure and have loads of fishes.

//And finally he found something interesting. A wooden chest containing N coins! But as you should remember, Tom is just a little cat, and so he can't open it by himself. Actually, the only thing he can really do is meowing. He can use his barking to attract nearby people and seek their help. He can set the loudness of his meowing very precisely, and therefore you can assume that he can choose to call any number of people, from a minimum of 1, to a maximum of K.

//When people come and open the chest they divide all the coins between them in such a way that everyone will get the same amount of coins and this amount is maximal possible. If some coins are not used they will leave it on the ground and Tom will take them after they go away. Since Tom is clearly not a fool, he understands that his profit depends on the number of people he will call. While Tom works on his meowing, you have to find the maximum possible number of coins he can get.

//Input Format

//The first line of the input contains an integer T denoting the number of test cases. Each of next T lines contains 2 space-separated integers: N and K, for this test case.


//Source Code


import java.io.*;
import java.util.*;

public class  GreedyTom{

    public static void main(String[] args) {
       
        Scanner scn = new Scanner (System.in );
        
        int T = scn.nextInt();
        
       while(T>0){
    
           int n = scn.nextInt();
           int k = scn.nextInt();
    int i,max;  
    max = n%2;
    for(i=2;i<=k;i++){
        if(n%i > max){
            max = n%i;
        }
    }
   System.out.println(max);
           T--;
        }
        
        
    }
}