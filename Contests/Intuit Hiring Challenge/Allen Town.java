/*
Allen Town
Medium

In this ever-evolving era, Allen Town is equipped with one of the most-advanced sensors of all time.
There is always a demand of sentinel in "Allen Town" & today this responsibility falls upon your shoulders. Data-driven decision must be taken by you to ensure the best resolution of the catastrophe.
Building(s) has/have caught fire in a zone of the town because of a cross-fire between A.T.P.D. (Allen Town Police Department) & notorious illegal arms-trade organization members. As a preemptive measure by A.T.F.D. (Allen Town Fire Department) some water-reserves were set-aside in many zones (Node) in the city to fight any fire-related catastrophe.
Main-Task of the hour is to make a data-driven estimation from given raw-data so that A.T.F.D. can resolve this issue & reduce damage effectively.
	
Raw-data is collected by the sensors and you are required to assess.
	
You will have a data about:
1. The number of zones in Allen Town i.e. number of nodes of a tree.
2. The Zone-id of each zone & how they are connected i.e. preorder & postorder traversal of the tree.
3. Number of water-reserves in the Allen Town i.e. number of nodes having water-reserves.
4. The zones that have dedicated water-reserves (set-aside by A.T.F.D.) i.e. list of n nodes that are equipped with water-reserve.
5. Zone affected by the fire i.e. node which is affected by fire.

NOTE: 1. all the zones in Allen-Town are connected (either directly or indirectly.
	  2. Connection between zones is provided in the form of Binary-Tree Traversals.
	  3. Zones/Nodes having water-reserve will be able to put-out the fire & will act as a shield for its adjacent zones. 


"Fire is spreading to the adjacent zones by a unit of time & Your task is to provide detailed information to A.T.F.D.”
	
Detailed information should be provided in a particular format as explained below :
       
0 -> zones/nodes-affected-by-fire-at-0th-second (space-separated and sorted)
1 -> zones/nodes-affected-by-fire-at-1th-second (space-separated and sorted)
2 -> zones/nodes-affected-by-fire-at-2nd-second (space-separated and sorted)
3 -> zones/nodes-affected-by-fire-at-3rd-second (space-separated and sorted)
.
.
.
n -> zones/nodes-affected-by-fire-at-nth-second(space-separated and sorted)
(Till all reachable nodes/zones are consumed by fire).
 
 

Constraints
1 <= N <= 10^6

Format
Input
1. A number N representing number of zones in Allen Town.
2. N more numbers (zone-id) representing Pre-order traversal to give info about placement of zones.
3. N more numbers (zone-id) representing In-order traversal to give info about placement of zones.
4. A Number M representing frequency of water-reserves set-aside by A.T.F.D.
5. M more numbers representing zone-id of zones equipped with water-reserves.
6. Zone-id of the Zone affected by fire.

Output
1. Refer to the sample output.
 2. If the tree cannot be burned in any situation, write "Not Possible to Burn Tree".
 3. After every second print zones/nodes affected by fire in ascending order(Space-separated and sorted)

Example
Sample Input

9
12 13 10 14 21 24 15 22 23
13 12 21 14 24 10 22 15 23
2
21 15
10

Sample Output
0 -> 10 
1 -> 12 14 
2 -> 13 24*/