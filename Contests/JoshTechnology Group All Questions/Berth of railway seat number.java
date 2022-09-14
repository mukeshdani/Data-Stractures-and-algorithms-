//Berth of railway seat number
//https://www.codingninjas.com/codestudio/problems/berth-of-railway-seat-number_799353?leftPanelTab=2



public class Solution {
    public static String berthType(int seatNumber) {
        // Check for Invalid seat number first
        if (seatNumber > 0 && seatNumber < 73) {
            // Save the seatNumber mod with 8 somewhere
            int x = seatNumber % 8;

            // Check for lower berth
            if (x == 1 || x == 4) {
                return "Lower";
            }

            // Check for middle berth
            else if (x == 2 || x == 5) {
                return "Middle";
            }

            // Check for upper berth
            else if (x == 3 || x == 6) {
                return "Upper";
            }

            // Check for side lower berth
            else if (x == 7) {
                return "Side Lower";
            }

            // Check for side upper berth
            else {
                return "Side Upper";
            }

        }

        return "Invalid";
    }
}