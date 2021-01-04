/* Two Sum- Daily Problem 1 [Easy]
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */
package challenges.daily;
import java.util.Set;
import java.util.HashSet;

public class TwoSum1 {

    // O(n) Extra Space (n) hashing approach
    // map every element in the array using a HashSet
    // iterate, and if the K - element exist in the hashed set return true
    // Else return false
    public static boolean problem1(int arr[], int k) {
        Set<Integer> s= new HashSet<Integer>();
        for(int x : arr){
            s.add(x);
        }

        for(int x : arr){
            if(s.contains(k-x))
                return true;
        }
        return false;
    }
}
