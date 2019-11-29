public class Esn{
    public static String[][] nse(String[] a, String[] b){
        String[][] c = new String [a.length][];
        for (int i=0; i<a.length; i++){
            c[i] = new String [a[i].length()];
            for (int j=0; j<a[i].length(); j++){
                c[i][j]=a[i].charAt(j)+b[i];        
            }
        
        } 

        return c;

    }

    public static String[][] nseR(String[]a, String[]b){
        String[][] c = new String [a.length][];
        return nseR(a,b,c,0,0);
    }

    public static String[][] nseR(String[]a, String[]b, String[][] c, int i, int j){
        if(i==a.length)
            return c;
        if(j==0)
            c[i] = new String [a[i].length()];
        if(j==a[i].length())
            return nseR(a,b,c,i+1,0);
        c[i][j]=a[i].charAt(j)+b[i];
        return nseR(a,b,c,i,j+1);
    }
    public static void main(String[] args) {
        String[] a = {"ab", "st", "e", "fhgs"};
        String[] b = {"rp", "k", "uxy", "tronzo"};
        
        String[][] c = nseR(a,b);
        Stampe.stampa(c);
    }
}

