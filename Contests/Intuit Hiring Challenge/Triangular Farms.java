/*Triangular Farms
Easy

robbery -> Note goes to explaination

Shyam is a farmer who owns a large plot near Jewar. Now, since land acquisition for Asia's largest airport has started, he will have to sell his farms to the government. Shyam is clever and he wants to maximize the profit that he can get by selling the farms, so he decided to divide the farms into as many triangular shapes as possible. 

However, the government has imposed the restriction that they will not buy any farm whose perimeter exceeds a given constraint 'bound'. Now, help Shyam count the number of possible triangular farms that he can sell to the government which does not violate any restriction.

For Example: Consider the length of Sides of Triangles that can be made in the farm: {5, 6, 8, 10, 2, 9, 3, 7, 1, 4}. Triangles with perimeter greater than or equal to 15 are not permissible.

Shyam can possibly sell the following 6 triangular farms to the government which have perimeter less than 15:

( 5, 6, 2 )
( 5, 6, 3 )
( 5, 2, 4 )
( 5, 3, 4 )
( 6, 3, 4 )
( 2, 3, 4 )

Constraints
1 <= Number of Sides <= 1000
 1 <= Side of a Triangle <= 10000
 1 <= Perimeter <= 10000

Format
Input
First line contains an integer N representing number of sides.
Second line N space separated integers representing the length of sides of triangles that can be made in the farms.
Third line contains an integer 'bound' representing upper limit of perimeter of triangle.

Output
Integer representing the count of valid triangular farms.

Example
Sample Input

10
5 6 8 10 2 9 3 7 1 4
15

Sample Output
6*/