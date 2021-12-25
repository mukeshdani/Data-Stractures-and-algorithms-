//Job Sequencing Problem  GFG
/* ---------------------------Greedy------------------- */
// What 
// local optimal choice at each step helps saving global optimum 
// (minima/maxima)

/* -------------------Jib Sequencing ------------- */
//Q--> 1 jpb = 1 unit of time  ----> maximum profit  

// 1. order of Picking job --> Decreasing order of profits
// 2. Picking job should be placed as last as possible


// Time -->(d*N + NlogN)


import java.io.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}

class Solution
{
    public static class MyComparator implements Comparator<Job>{
        public int compare(Job obj1, Job obj2){
            if(obj1.profit != obj2.profit)
                return obj2.profit - obj1.profit;
            return obj2.deadline - obj1.deadline;
        }
    }
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, new MyComparator());// Time --> NlogN
        int maxDeadline = arr[0].deadline;
        for(int i=0; i<n; i++)
            maxDeadline = Math.max(arr[i].deadline, maxDeadline);
        
        int maxProfit = 0, jobsAllocated = 0;
        boolean[] slots = new boolean[maxDeadline];
        
        //Time --> d*N where d = max deadline 
        for(int i=0; i<n; i++){
            for(int j = arr[i].deadline - 1; j>=0; j--){
                if(slots[j] == false){
                    slots[j] = true;
                    maxProfit += arr[i].profit;
                    jobsAllocated++;
                    break;
                }
            }
        }
        
        return new int[]{jobsAllocated, maxProfit};
    }
}
/*
Given a set of N jobs where each jobi has a deadline and profit associated with it.

Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit associated with job if and only if the job is completed by its deadline.

Find the number of jobs done and the maximum profit.

Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job.


Example 1:

Input:
N = 4
Jobs = {(1,4,20),(2,1,10),(3,1,40),(4,1,30)}
Output:
2 60
Explanation:
Job1 and Job3 can be done with
maximum profit of 60 (20+40).
Example 2:

Input:
N = 5
Jobs = {(1,2,100),(2,1,19),(3,2,27),
        (4,1,25),(5,1,15)}
Output:
2 127
Explanation:
2 jobs can be done with
maximum profit of 127 (100+27).

Your Task :
You don't need to read input or print anything. Your task is to complete the function JobScheduling() which takes an integer N and an array of Jobs(Job id, Deadline, Profit) as input and returns the count of jobs and maximum profit.


Expected Time Complexity: O(NlogN)
Expected Auxilliary Space: O(N)


Constraints:
1 <= N <= 105
1 <= Deadline <= 100
1 <= Profit <= 500*/