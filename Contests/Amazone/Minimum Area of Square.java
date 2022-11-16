//Minimum Area of Square
//
/*
 * 
 * 
 * Given a list of points described by their (x,y) coordinates on a two-dimensional plane, construct a square surrounding at least a given number of points within the area enclosed. That area should be minimal and the square must meet the following conditions:

• The x-coordinates and y-coordinates of the points should be integers.

• The sides of the square should be parallel to coordinate axes.

• At least k of the given n points should lie strictly inside the square drawn. Strictly inside means that they cannot lie on a side of the square.

For example, given n=3 points (1,1), (1,2) and (2,1) and k=3, surround all three points. The minimum area square is 9 units, going from the origin (0,0), to (3,3).
 */


/* 
private static long minArea(int[] xs, int[] ys) {
    int minX=Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
    int minY=Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
    for(int i=0;i<xs.length;i++) {
    int x = xs[i];
    if(x < minX) minX = x;
    if(x > maxX) maxX = x;
    int y = ys[i];
    
            if(y < minY) minY = y;
            if(y > maxY) maxY = y;
        }
        
        long width = maxX+1 - (minX-1);
        long height = maxY+1 - (minY-1);
        
        long max = Math.max(width, height);
        return max*max;
    }


*/