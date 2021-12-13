
//DiagonalMoveInMazzePath




























/*Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and
columns on a rectangular board.

Our player starts in top-left corner of the board and must reach bottom-right
corner. In one move the player can move 1 step horizontally (right) or 1 step
vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the
player can travel across the board. Print the value returned.

b. Write a recursive function which returns an ArrayList of moves for all valid
paths across the board. Print the value returned.

c. Write a recursive function which prints moves for all valid paths across the
board (void is the return type for function).

Example(To be used only for expected output):
Input:
2 2
output

13
[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]
HHVV
HVHV
HVVH
HVD
HDV
VHHV
VHVH
VHD
VVHH
VDH
DHV
DVH
DD
Input Format

Integer Input

Constraints

1<= n <=1000000000

Output Format

print the output.

Sample Input 0

2 2
Sample Output 0

13
[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]
HHVV
HVHV
HVVH
HVD
HDV
VHHV
VHVH
VHD
VVHH
VDH
DHV
DVH
DD*/