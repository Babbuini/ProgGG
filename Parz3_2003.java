public class Parz3_2003{
    public static boolean confronto(int[][]a) {
        int sommaconf=0;
        for(int i=0;i<a.length;i++){
            int somma=0;
            for(int j=0;j<a[i].length;j++){
                somma=somma+a[i][j];
            }
            if(i==0)
                sommaconf=somma;
            else
                if(sommaconf!=somma)
                    return false;
        }
        return true;
    }
    public static boolean confrontoR(int[][]a) {
        return confrontoR(a,0,0,0,0);
    }
    public static boolean confrontoR(int[][]a,int sommaconf,int somma,int i, int j) {
        if(i==a.length)
            return true;
        if(j==a[i].length){
            if(i==0)
                return confrontoR(a,somma,0,i+1,0);
            if(sommaconf==somma)
                return confrontoR(a,sommaconf,0,i+1,0);
            else
                return false;
        }
        somma=somma+a[i][j];
        return confrontoR(a,sommaconf,somma,i,j+1);
    }
    public static void main(String[] args) {
        int[][]a={{1,-2,5,3},{2,9,-1,1,-3},{-4,7,2,2}};
        System.out.println(confrontoR(a));
    }
}