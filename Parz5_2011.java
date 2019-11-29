
public class Parz5_2011{
    public static String[][] es(String [][] a,int[]b) {
        String [][]s= new String[a.length][];
        for(int i=0;i<a.length;i++){
            s[i]=new String[a[i].length];
            for(int j=0;j<a[i].length;j++){
                if(a[i][j].length()>=b[i])
                    s[i][j]=a[i][j].substring(0,b[i]);
                else
                    s[i][j]="-";
            }
        }
        return s;
    }
    public static String[][] esR(String [][] a,int[]b) {
        String [][]s= new String[a.length][];
        return esR(a,b,s,0,0);
    }
    public static String[][] esR(String[][]a,int[]b,String[][]s,int i,int j) {
        if(i==a.length)
            return s;
        if(j==0)
          s[i]=new String[a[i].length];
        if(j==a[i].length)
            return esR(a,b,s,i+1,0);
        if(a[i][j].length()>=b[i])
            s[i][j]=a[i][j].substring(0,b[i]);
        else
            s[i][j]="-";
        return esR(a,b,s,i,j+1);
    }
    public static void main(String[] args) {
        String [][]a={{"anna","lea","liliana"},{"mario","paolo"},{"enrica","luca","ugo","laura"}};
        int [] b={5,3,4};
        String[][] c=esR(a,b);
        Stampe.stampa(c);
    }
}