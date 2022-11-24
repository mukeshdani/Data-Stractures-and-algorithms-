

/*     ------------------------------------ */
import java.util.*;

class BiasedStandings {

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String>[] buckets = new ArrayList[n+1];

        for(int i=0; i<=n; i++)
            buckets[i] = new ArrayList<>();

        for(int i=0; i<=n; i++){
            String str = sc.next();
            int rank = sc.nextInt();
            buckets[rank].add(str);
        }

        int currRank = 1, badness = 0;
        for(int i=0; i<=n; i++){
            for(String str: buckets[i]){
                badness += (Math.abs(i - currRank));
                currRank++;
            }
        }
        System.out.println(badness);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String temp = sc.nextLine();
            solve();
        }
    }
}