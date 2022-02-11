//Down to Zero II

//TLE -> Solution 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'downToZero' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
  static int[] minMoves = new int[1000001];
    public static int downToZero(int n) {
    // Write your code here
    if (n <= 3) return n;
    if (minMoves[n] > 0) return minMoves[n];
    int min = Integer.MAX_VALUE;
    for (int i=2; i<=Math.sqrt(n); i++) {
        if (n % i == 0) {
            int factor = n/i;
            min = Math.min(min, 1 + minMove(factor));
        }
    }
    min = Math.min(min, 1 + minMove(n-1));
    minMoves[n] = min;
    return min;
}
public static int minMove(int n) {
    if (n <= 3) return n;
    if (minMoves[n] > 0) return minMoves[n];
    int min = Integer.MAX_VALUE;
    for (int i=2; i<=Math.sqrt(n); i++) {
        if (n % i == 0) {
            int factor = n/i;
            min = Math.min(min, 1 + minMove(factor));
        }
    }
    min = Math.min(min, 1 + minMove(n-1));
    minMoves[n] = min;
    return min;
}

    
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.downToZero(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
