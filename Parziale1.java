/*Scrivere un metodo che, dati un array bidimensionale di interia, un ar-ray
 monodimensionale di interir ed un intero k, restituisce un array 
monodimensionale di booleani b tale che b[i] vale true se 
esistono almeno k coppie di elementi adiacenti di a[i] tali 
che la loro somma `e uguale ad r[i], altrimenti b[i] vale false.
Esempio:  se a={{3,-7,12,0,2,3,9,3,2,10},{1,1,-9,1,1},{4},{7,-1,3,3,3,2}},
r={12,2,5,6} e k=3, il metodo restituisce l’arrayb={true,false,false,true}.
Si assuma k >0 e che gli array a ed r abbiano la stessa lunghezza*/
public class Parziale1{
    public static boolean[] coppie(int [][] a, int[] r, int k) {
        boolean[] b = new boolean [a.length];
        for(int i=0;i<a.length;i++){
            int cont=0;
            for(int j=0;j<a[i].length-1 && !b[i];j++){
                if(a[i][j]+a[i][j+1]==r[i]){
                    cont++;
                }
                if(cont==k){
                    b[i]=true;
                }
            }
        }
        return b;
    }
    public static boolean[] coppieR(int[][] a,int[] r, int k) {
        boolean[] b = new boolean [a.length];
        return coppieR(a,r,k,b,0,0,0);
    }
    public static boolean[] coppieR(int[][] a, int[] r, int k, boolean[]  b, int i, int j, int cont){
        if(cont==k){
            b[i]=true;
            return coppieR(a, r, k, b, i+1, 0, 0);
        }
        if(i==a.length){
            return b;
        }
        if(j==a[i].length-1){
            return coppieR(a,r,k,b,i+1,0,0);
        }
        if(a[i][j]+a[i][j+1]==r[i]){
            return coppieR(a,r,k,b,i,j+1,cont+1);
        }
        return coppieR(a,r,k,b,i,j+1,cont);
    }
    public static void main(String[] args) {
       int[][]  a={{3,-7,12,0,2,3,9,3,2,10},{1,1,-9,1,1},{4},{7,-1,3,3,3,2}};
       int[] r={12,2,5,6};
       int k=3;
       boolean [] b=coppieR(a,r,k);
       for(int i=0;i<b.length;i++){
           System.out.println(b[i]);
       } 
    }
}