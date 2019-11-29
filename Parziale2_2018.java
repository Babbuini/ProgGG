/*Input: String[]a
Output:char [][] c 
tale che la riga c[i] contiene i caratteri della stringa a[i] letta da sx a dx*/
public class Parziale2_2018{
    public static char[][] spelling(String[] a) {
        char[][] c=new char [a.length][];
        for(int i=0;i<a.length;i++){
            c[i]=new char[a[i].length()];
            for(int j=0;j<a[i].length();j++){
                c[i][j]=a[i].charAt(j);
            }
        }
        return c;
    }
    public static char[][] spellingR(String[] a){
        char[][] c=new char [a.length][];
        return spellingR(a,c,0,0);
    }
    public static char[][] spellingR(String[] a,char[][] c,int i,int j) {
        if(i==a.length)
            return c;
        if(j==0)
            c[i]=new char [a[i].length()];
        if(j==a[i].length())
            return spellingR(a,c,i+1,0);
        c[i][j]=a[i].charAt(j);
        return spellingR(a,c,i,j+1);
    }
    public static void main(String[] args) {
        String a[]={"dcba","k","","9qr","v3"};
        char [][]c=spellingR(a);
        Stampe.stampa(c);
        /*for(int i=0; i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}