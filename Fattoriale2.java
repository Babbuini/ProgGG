public class Fattoriale2{
    public static int fattTR(int n) {
        if(n<0) return -1;
        return fattTR(n,1);        
    }
    public static int fattTR(int n, int r) {
        if(n==0) return r;
        return fattTR(n-1, n*r);
    }
    public static void main(String[] args) {
        System.out.print(fattTR(4));
    }
}