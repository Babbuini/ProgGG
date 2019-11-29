public class Mult {
    public static int mult (int x, int y) {
        int z = 0;
        while (y > 0) {
        z = z+x;
        y = y-1;
        }
        return z;
    }
}