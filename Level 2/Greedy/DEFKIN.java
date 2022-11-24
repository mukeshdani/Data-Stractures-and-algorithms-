//DEFKIN - Defense of a Kingdom
//https://www.spoj.com/problems/DEFKIN/

import java.util.*;

class DefenseOfAKingdom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
            ArrayList<Integer> rows = new ArrayList<>(), cols = new ArrayList<>();
            
            rows.add(0); rows.add(h+1);
            cols.add(0); cols.add(w+1);

            for(int i=0; i<n; i++){
                int x = sc.nextInt(), y = sc.nextInt();
                rows.add(y);
                cols.add(x);
            }

            Collections.sort(rows);
            Collections.sort(cols);

            int maxDiffRow = 0;
            int maxDiffCol = 0;
            for(int i=1; i<rows.size(); i++){
                maxDiffRow = Math.max(maxDiffRow, rows.get(i) - rows.get(i-1) - 1);
                maxDiffCol = Math.max(maxDiffCol, cols.get(i) - cols.get(i-1) - 1);
            }

            System.out.println(maxDiffRow * maxDiffCol);
        }
    }
}
/*
Theodore implements a new strategy game “Defense of a Kingdom”. On each level a player defends the Kingdom that is represented by a rectangular grid of cells. The player builds crossbow towers in some cells of the grid. The tower defends all the cells in the same row and the same column. No two towers share a row or a column.

The penalty of the position is the number of cells in the largest undefended rectangle. For example, the position shown on the picture has penalty 12.

This position has a penalty of 12.

Help Theodore write a program that calculates the penalty of the given position.

Input
The first line of the input file contains the number of test cases.

Each test case consists of a line with three integer numbers: w — width of the grid, h — height of the grid and n — number of crossbow towers (1 ≤ w, h ≤ 40 000; 0 ≤ n ≤ min(w, h)).

Each of the following n lines contains two integer numbers xi and yi — the coordinates of the cell occupied by a tower (1 ≤ xi ≤ w; 1 ≤ yi ≤ h).

Output
For each test case, output a single integer number — the number of cells in the largest rectangle that is not defended by the towers.

Example
Input:
1
15 8 3
3 8
11 2
8 6

Output:
12*/