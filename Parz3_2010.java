public class Parz3_2010{
    public static String[] es(String[]a,char[]c) {
        String[] b=new String[a.length];
        for(int i=0;i<a.length;i++){
            b[i]="";
            for(int j=0;j<a[i].length();j++){
                if(a[i].charAt(j)==c[i])
                    b[i]=b[i]+c[i];
            }
        }
        return b;
    }
    public static String[] esR(String[]a,char[]c) {
        String[]b=new String[a.length];
        return esR(a,c,b,0,0);
    }
    public static String[] esR(String[]a,char[]c,String[]b,int i,int j) {
        if(i==a.length)
            return b;
        if(j==0)
            b[i]="";
        if(j==a[i].length())
            return esR(a,c,b,i+1,0);
        if(a[i].charAt(j)==c[i])
            b[i]=b[i]+c[i];
        return esR(a,c,b,i,j+1);
    }
    public static void main(String[] args) {
        String[] a={"minnie","lillo","pluto","pippo"};
        char[] c={'i','l','r','p'};
        Stampe.stampa(esR(a,c));
    }
}