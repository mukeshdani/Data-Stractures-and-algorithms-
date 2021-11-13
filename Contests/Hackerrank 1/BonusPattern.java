//Bonus Pattern

//Write a program that receives a number as input and prints it in the following format as shown in the sample case below.

//Input Format

//A Single line of input, one integers n

//Sample Input 0

//3
//Sample Output 0

//1*2*3*10*11*12
//--4*5*8*9
//----6*7

//Source Code


import java.io.*;
import java.util.*;

public class BonusPattern  {

     public static void trapeziumPattern(int num)
    {
 
        int firsthalf = 1;
        int secondhalf = (num * num) + 1;
        int numOfSpaces = 0;
 
        
        for (int numOfLines = num; numOfLines >= 1;
             numOfLines--) {
 
        
            for (int numOfSpacesCounter = numOfSpaces;
                 numOfSpacesCounter >= 1;
                 numOfSpacesCounter--) {
                System.out.print("-");
            }
 
        
            for (int firstHalfCounter = 1;
                 firstHalfCounter <= numOfLines;
                 firstHalfCounter++) {
 
        
                if (firstHalfCounter == numOfLines)
                    System.out.print((firsthalf++));
 
                else
                    System.out.print((firsthalf++) + "*");
            }
 
            
            for (int secondHalfCounter = 1;
                 secondHalfCounter <= numOfLines;
                 secondHalfCounter++) {
                System.out.print("*" + (secondhalf++));
            }
 
            System.out.println();
 
            
            numOfSpaces += 2;
 
            
            secondhalf
                = (secondhalf - 1) - ((numOfLines - 1) * 2);
        }
    }
 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        
        int n = scn.nextInt();
        trapeziumPattern(n);
                
    }
    
    
    
    
    }
    
    

