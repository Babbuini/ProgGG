public class Gallo{
    public static int minl(int[] a) {
        int tot=a[0];
        for(int i=2;i<a.length;i++){
        tot=tot+a[i-1];
        if(a[i]<tot)
            return i;
        }
        return 10;
    }
    public static int minr(int[]a) {
        int tot=a[a.length-1];
        for(int i=a.length-3;i>=0;i--){
            tot=tot+a[i+1];
            if(a[i]<tot)
                return i;
        }
        return 10;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        int left=minl(a);
        int right=minr(a);
        if(left==10)
            System.out.println("Non esiste numero minore della somma degli elementi precedenti");
        else
            System.out.println("Il numero minore della somma degli elementi precedenti è in posizione "+left+", numero"+a[left]);
        if(right==10)
            System.out.println("Non esiste numero minore della somma degli elementi successivi");
        else
            System.out.println("Il numero minore della somma degli elementi successivi è in posizione "+right+", numero"+a[right]);
    
    }
}