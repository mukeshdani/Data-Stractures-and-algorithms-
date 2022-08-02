//Car Fleet
//https://leetcode.com/problems/car-fleet/

import java.util.*;
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       Car[] cars = new Car[position.length];
       for(int i = 0 ; i<position.length ; i++){
           cars[i] = new Car(position[i] , speed[i]);
       } 
        
        Arrays.sort(cars);
        
        int groups = 0 ;
        double time = 0;
        
        for(int i = cars.length -1 ; i>=0 ; i--){
            Car c = cars[i];
            double ctime = (target - c.pos) * 1.0/c.speed;
            
            if(ctime > time){
                time = ctime;
                groups++;
            }
        }
        return groups;
    }
    
    public class Car implements Comparable<Car>{
        int pos;
        int speed ;
        Car(int pos , int speed){
            this.pos = pos ; 
            this.speed = speed;
        }
        
        public int compareTo(Car o){
            return this.pos - o.pos;
        }
    }
}