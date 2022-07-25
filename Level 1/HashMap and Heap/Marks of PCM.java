/* //Marks of PCM
//https://practice.geeksforgeeks.org/problems/marks-of-pcm2529/1

class Solution
{
    class Marks{
        int phy, chem, maths;
        Marks(int phy, int chem, int maths){
            this.phy = phy;
            this.chem = chem;
            this.maths = maths;
        }
    }

    class MarksCmp implements Comparator<Marks>{
        public int compare(Marks s1, Marks s2){
            if(s1.phy < s2.phy) return -1;
            else if(s1.phy > s2.phy) return +1;
            else {
                if(s1.chem < s2.chem) return +1;
                else if(s1.chem > s2.chem) return -1;
                else {
                    if(s1.maths < s2.maths) return -1;
                    return +1;
                }
            }
        }
    }

    public void customSort (int phy[], int chem[], int math[], int N)
    {
        PriorityQueue<Marks> q = new PriorityQueue<>(new MarksCmp());

        for(int i=0; i<N; i++){
            Marks stud = new Marks(phy[i], chem[i], math[i]);
            q.add(stud);
        }

        int idx = 0;
        while(q.size() > 0){
            Marks stud = q.remove();
            phy[idx] = stud.phy;
            chem[idx] = stud.chem;
            math[idx] = stud.maths;
            idx++;
        }
    }
} */