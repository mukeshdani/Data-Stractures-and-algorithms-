//All Palindromic Permutations
/* 
import java.io.*;
import java.util.*;

public class Main {

	public static void generatepw(int cB, HashMap<Character, Integer> freq,StringBuilder permutaion) {
		  if(cB == permutaion.length() / 2){
			  System.out.println(permutaion);
			  return ;
		  }


		for(Character ch : freq.keySet()){
			if(freq.get(ch) > 0){
				int oldfreq = freq.get(ch);
				freq.put(ch ,oldfreq - 2);
				permutaion.setCharAt(cB , ch);
				permutaion.setCharAt(permutaion.length() - 1 - cB , ch);

				generatepw(cB + 1 , freq , permutaion);

				permutaion.setCharAt(cB , '0');
				permutaion.setCharAt(permutaion.length() - 1 - cB , '0');
				freq.put(ch , oldfreq);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}
		
		//write your code here
		Character oddFreq = '0';
		for(Character ch : freq.keySet()){
			if(freq.get(ch) % 2 == 1){
				if(oddFreq != '0'){
					System.out.println("-1");
					return ;
				}
			  oddFreq = ch;
			}
		}

      StringBuilder permutaion = new StringBuilder("");
	  for(int i = 0 ; i< str.length() ; i++){
		  permutaion.append('0');
	  }

	  if(str.length() % 2 == 1){
		  permutaion.setCharAt(str.length() / 2 , oddFreq);
		  freq.put(oddFreq , freq.getOrDefault(oddFreq , 0) - 1);
	  }

	  generatepw(0 , freq , permutaion);
	}
	
} */