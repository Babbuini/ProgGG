public class Parziale1_4{
    public static char[][] primi(String [][] a) {
        char[][] c= new char [a.length][];
        for(int i=0;i<a.length;i++){
            c[i]=new char [a[i].length];
            for(int j=0;j<a[i].length;j++){
                if(a[i][j].length()>0)
                    c[i][j]=a[i][j].charAt(0);
                else
                    c[i][j]='-';
            }
        }
        return c;
    }

    public static char[][] primiRic(String [][] a) {
        char[][] c= new char [a.length][];
        return primiRic(a,c,0,0);
    }

    public static char[][] primiRic(String[][] a, char[][] c,  int i, int j) {
        if(i==a.length)
            return c;
        if(j==0)
            c[i]= new char[a[i].length];    //crea prima l'array, poi se è vuoto rimane così, 
        if(j==a[i].length)                  //facendo il contrario ci sarebbe un campo vuoto
            return primiRic(a,c,i+1,0);
        if(a[i][j].length()>0)
            c[i][j]=a[i][j].charAt(0);
        else
            c[i][j]='-';

        return primiRic(a,c,i,j+1);
    }

    public static void main(String[] args) {
        String[][] a={{"abc","df",""},{"yy","ffxx"},{"qrjq","","p","hgfq"}};
        char [][] b = primiRic(a);
        for(int i=0; i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}