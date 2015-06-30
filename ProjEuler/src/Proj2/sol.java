package Proj2;

/**
 *
 * @author msant080
 */
public class sol {
    static int sol = 2;
    public static void main(String[] args){
        nextFibb(1,2);
    }
    
    
    public static void nextFibb(int x, int y) {
        int z = x + y;
        if (z < 4000000) {
            if (z%2 == 0)
                sol += z;
            nextFibb(y, z);
        }
    }
}
