//Any Base Multiplication

//You are given a base b.
//You are given two numbers n1 and n2 of base b.
//You are required to multiply n1 and n2 and print the value.

//Input Format

//A base b
//A number n1
//A number n2

//Sample Input 0

//5
//1220
//31

//Sample Output 0

//43320



import java.util.*;

public class AnyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int rv = 0;

     int c = 0;
     int p = 1;
     while(n2 > 0){
        int d2 = n2 % 10;
        n2 = n2 / 10;

        int pwd = getProductWithDigit(b, n1, d2);
        rv = getSum(b, rv, p * pwd);
        p = p * 10;
     }

     return rv;
 }

 public static int getProductWithDigit(int b, int n1, int d2){
     int rv = 0;

     int c = 0;
     int p = 1;
     while(n1 > 0 || c > 0){
        int d1 = n1 % 10;
        n1 = n1 / 10;

       int d = d1 * d2 + c;
       c = d / b;
       d = d % b;

       rv += d * p;
       p = p * 10;
     }

     return rv;
 }

 public static int getSum(int b, int n1, int n2){
    int rv = 0;

    int c = 0;
    int p = 1;
    while(n1 > 0 || n2 > 0 || c > 0){
       int d1 = n1 % 10;
       int d2 = n2 % 10;
       n1 = n1 / 10;
       n2 = n2 / 10;

       int d = d1 + d2 + c;
       c = d / b;
       d = d % b;

       rv += d * p;
       p = p * 10;
    }

    return rv;
}

}
                        
                        