/*Input: Int[][]a,int[]b,int k
Output: true se in ogni riga a[i] esistono almeno k elementi <= b[i]
        false altrimenti*/
public class Parziale1_2018{
    public static boolean es1(int[][]a,int[]b,int k) {
        /*boolean b=true;*/
        for(int i=0;i<a.length;i++){
            int cont=0;
            /*b=false;*/
            for(int j=0;j<a[i].length && cont<k/*!b*/;j++){
                if(a[i][j]<=b[i])
                    cont++;
                /*if(cont==k)
                b=true;*/
            }
            if(cont<k)
                return false;
            /*if(!b)
                return b;*/
        }
        return true;
    }
    public static void main(String[] args) {
        int [][] a={{7,3,-2,2,9},{5,0,8,3},{15,11,-2}};
        int[]b={6,3,11};
        int k=2;
        System.out.println(es1(a,b,k));
    }
}