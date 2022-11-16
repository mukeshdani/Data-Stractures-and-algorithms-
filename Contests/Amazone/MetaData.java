// MetaData
/* 
 * . Given a List of Orders , where each Order is a string . For example : [aax 12 23 ] [ ff kindle ebook] are two orders. Each order has an ID which is first part of the order ( ID of order 1 = aax , ID2 = ff ). The remaining part of the order is referred to as MetaData. There are two types of orders, Prime orders ( which contain non numeric Meta Data) and Non-Prime Orders (which contain Only-Numeric Meta Data). Sort the List of Orders as given below :
a. Prime Orders before NonPrime Orders
b. Prime Order with lexicographically smaller MetaData comes first.
c. In Case of tie in (b) , the one with lexicographically smaller ID comes first.
d. The relative order of NonPrime Orders remains the same.
 */


import java.util.*;
class Solution{
    public static List<String> sortOrders(List<String> orderList) {
        orderList.sort((order1, order2) -> {
            boolean isOrder1Prime = isPrimeOrder(order1);
            boolean isOrder2Prime = isPrimeOrder(order2);

            String[] order1Parts = order1.split(" ", 2);
            String[] order2Parts = order2.split(" ", 2);

            if(isOrder1Prime && isOrder2Prime) {
                // both prime orders, so compare to prioritize
                int compareMetadata = order1Parts[1].compareTo(order2Parts[1]);
                if(compareMetadata != 0)
                    return compareMetadata;
                return order1Parts[0].compareTo(order2Parts[0]);
            }
            // prioritize if there is only prime order
            if(isOrder1Prime)
                return -1;
            if (isOrder2Prime)
                return 1;
            // retain original order if both the order are non-prime
            return 0;
        });

        return orderList;
    }

    private static boolean isPrimeOrder(String order) {
        String[] orderParts = order.split(" ", 3);
        try {
            Integer.parseInt(orderParts[1]);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}
