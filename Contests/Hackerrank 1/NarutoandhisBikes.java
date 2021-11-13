//Naruto opened a company which manufactures cars and bikes. Each car requires 4 tyres while each bike requires 2 tyres. Naruto has a total of N tyres (N is even). He wants to manufacture maximum number of cars from these tyres and then manufacture bikes from the remaining tyres.

//Naruto's friend Sasuke went to Naruto to purchase a bike. If Naruto's company has manufactured even a single bike then Naruto's friend will be able to purchase it.

//Determine whether he will be able to purchase the bike or not.

//Input Format

//The first line contains an integer T denoting the number of test cases. The T test cases then follow.
//The first line of each test case contains an integer N denoting the number of tyres.

//Source Code

import java.io.*;
import java.util.*;

public class NarutoandhisBikes {

    public static void main(String[] args) {
       
        Scanner scn = new Scanner (System.in );
        
        int T = scn.nextInt();
        while(T>0){
       int N = scn.nextInt();
            
            if(N%4==0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        T--;
        }
        
        
    }
}