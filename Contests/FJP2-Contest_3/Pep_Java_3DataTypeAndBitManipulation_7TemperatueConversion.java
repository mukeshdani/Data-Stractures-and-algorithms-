//Pep_Java_3DataTypeAndBitManipulation_7TemperatueConversion
//Given a Temperature N in Fahrenheit scale convert it into Celsius scale .

//Take the following as input.
//1. A number representing Fahrenheit: N

//let us assume Celsius is a float value.

//For Example:
//Input : 32
//Output : 0

//Input : -40
//Output : -40

//Explanantion :

//Formula for converting Fahrenheit scale to Celsius scale

//T(°C) = (T(°F) - 32) × 5/9
//Input Format

//Integer representing N

//Source Code

import java.io.*;
import java.util.*;

public class Pep_Java_3DataTypeAndBitManipulation_7TemperatueConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn = new Scanner (System.in);
        
        int n = scn.nextInt();
        
        
         float celsius = 0.0f;
  
        // calculate celsius temperature
        celsius = (n - 32) / 1.8f;
  
        // print the celsius temperature
        System.out.println(celsius);
    }
    
    }
