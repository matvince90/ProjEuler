/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob3;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author msant080
 */
public class sol {
    static long input;
    static Set<Integer> factors ;
    
    public static void main(String[] args) {
        input = 600851475143L;
        factors = new HashSet<>();
        
        getFactors(input);
        System.out.println("Answer: " + factors);

    }
    
    public static void getFactors(long num) {
        long numCopy = num;
        
        for(int i = 2; i <= numCopy; i++) {
            if (numCopy%i == 0) {
                factors.add(i);
                numCopy /= i;
                i--;
            }
        }
    }
}
