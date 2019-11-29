public class Arith {
    
public static int mult (int x, int y) {
    int z = 0;
    while (y > 0) {
        z = z+x;
        y = y-1;
    }
    return z;
    }
public static int exp (int x, int y) {
    int z = 1;
    while (y > 0) {
        z = mult(x,z);
        y = y-1;
    }
    return z;
    }
}
