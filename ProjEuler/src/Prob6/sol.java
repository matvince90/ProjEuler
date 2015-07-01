/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob6;

import java.lang.reflect.Array;

/**
 *
 * @author msant080
 */
public class sol {
    
    public static void main (String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 100; i++) {
            a += i*i;
            b += i;
        }
        b *= b;
        
        int sol = b-a;
        
        System.out.println(sol);
    }
    
    
}
