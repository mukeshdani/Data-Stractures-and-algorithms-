//Best Meeting Point
//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/best-meeting-point/ojquestion
/* 

public static int minTotalDistance(int[][] grid) {
    // Write your code here
    //rows 
    ArrayList<Integer> rows = new ArrayList<>();
    for(int i = 0 ; i< grid.length ; i++){
        for(int j= 0 ; j< grid[0].length ; j++){
            if(grid[i][j] == 1){
            rows.add(i);
            }
        }
    }
    
    //colums
      ArrayList<Integer> cols = new ArrayList<>();
    for(int j = 0 ; j< grid[0].length ; j++){
        for(int i= 0 ; i< grid.length ; i++){
            if(grid[i][j] == 1){
            cols.add(j);
            }
        }
    }
    
   int x1 = rows.get(rows.size()/2);
    int c1 = cols.get(cols.size()/2);
    
    //Distance 
    int n1 = 0 ;
    for(int row : rows){
        n1 += Math.abs(row - x1);
    }
    
    int n2 = 0 ;
    for(int col : cols){
        n2 += Math.abs(col - c1);
    }
    
    
    return n1 + n2;
   
    
} */