public class Fattoriale{
    public static int fattR(int n) {
        if(n<0) return -1;
        if(n==0) return 1;
        return n*fattR(n-1);
    }
    public static void main(String[] args) {
        int n=4,m;
        m=fattR(n);
        System.out.println(m);
    }
}