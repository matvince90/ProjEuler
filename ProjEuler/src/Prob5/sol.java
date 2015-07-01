/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob5;

/**
 *
 * @author msant080
 */
public class sol {
    
    public static void main (String[] args) {
        int i = 20;
        while(!check(i)) i += 2;
        System.out.println("Answer: " + i);
    }

    public static boolean check(int i) {
        for (int j = 3; j <= 20; j++) {
            if (i%j != 0)
                return false;
        }
        return true;
    }
}
