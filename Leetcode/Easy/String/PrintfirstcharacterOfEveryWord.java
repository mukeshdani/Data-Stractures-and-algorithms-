
// Print first character of every word


package string;

public class PrintFirstCharacterOfWord {

  public static void main(String[] args) {
    
    String s = "Hello User!! Welcome";
    
    char a[] = s.toCharArray();
    
    for(int i = 0; i < a.length; i++) {
      if(a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
        System.out.println(a[i]);
      }
    }
  }
}
