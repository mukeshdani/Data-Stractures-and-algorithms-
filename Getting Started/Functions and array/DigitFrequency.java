
//1. You are given a number n.
//2. You are given a digit d.
//3. You are required to calculate the frequency of digit d in number n.

import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int n = m.nextInt();
        int d = m.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int freq=0 ;
        while (n!=0){
         int ans = n%10;
         if (ans==d){
             freq=freq+1;
         }
         n = n/10;
        }
        return freq;

    }
}