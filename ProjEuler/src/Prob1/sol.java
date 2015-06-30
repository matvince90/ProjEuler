package Prob1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author msant080
 */
public class sol {
    public static void main(String[] args) {
        ArrayList<Integer> threes = getVals(3, 1000);
        ArrayList<Integer> fives = getVals(5, 1000);
        
        System.out.println(threes);
        System.out.println(fives);
        
        threes.addAll(fives);
        Set<Integer> set = new HashSet<>(threes);
        int sol = addSet(set);
        
        System.out.println("Answer: " + sol);
        
    }
    
    public static ArrayList<Integer> getVals(int check, int max) {
        int counter = 1;
        ArrayList<Integer> vals = new ArrayList<>();
        while (counter < max) {
            if ((counter)%check == 0)
                vals.add(counter);
            counter++;
        }
        return vals;
    }
    
    public static int addSet(Set<Integer> arr) {
        int ret = 0;
        for(int i : arr) {
            ret += i;
        }
        return ret;
    }
    
}
