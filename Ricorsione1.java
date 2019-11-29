/*Input: int[]a,int n
Output: true se n in a, false altrimenti*/
public class Ricorsione1 {
    public static boolean cerca(int[] a,int n) {
        return cerca(a,n,0);
    }
    public static boolean cerca(int[] a, int n, int i) {
        if(i==a.length) return false;
        if(a[i]==n) return true;
        return cerca(a,n,i+1);
    }
    public static void main(String[] args) {
        int[] a={5,5,68,4,1,61};
        int n=9;
        System.out.println(cerca(a,n));
    }
}