/*Scrivere un metodostaticoiterativo che, dati un array bidimensionale distringheaed un array monodimensionale di stringhec,
 restituisce un array monodimensio-nale di booleanibtale cheb[i] 
valetruese la stringac[i] `e prefisso dialmenouna stringa ina[i], altrimentib[i] valefalse
. (N.B. utilizzare il metodo substring.)Esempio: se a={{"cappello","","bozza"},{"carota","carro"}
,{"su","pericolo","sopra","pero"}}ec={"appello","caro","per"},
 il metodo restituisce l’array{false,true,true}.
 Modificare la definizione del metodo in modo da sollevare
 un’eccezione se lelunghezze diaecsono diverse*/
public class Pref{
    public static boolean[] cerca(String[][] a, String[] c) {
        boolean [] b= new boolean [a.length];
        for(int i=0 ; i<a.length ; i++){
            for(int j=0; j<a[i].length && !b[i] ; j++){
                if(a[i][j].length() >= c[i].length()){
                    if(c[i].equals(a[i][j].substring(0,c[i].length()))){
                        b[i]=true;                
                    }
                }
            }
        }
        return b;
    }
    public static boolean[] cercaric(String[][] a, String[] c) {
        boolean [] b = new boolean [a.length];
        return cercaric(a,c,0,0,b);
    }
    
    public static boolean[] cercaric(String[][] a, String[] c, int i, int j, boolean[] b) {
        if(i == a.length){
            return b;
        }
        if(j == a[i].length || b[i]){
            return cercaric(a,c,i+1,0,b);
        }
        if(a[i][j].length() >= c[i].length()){
            if(c[i].equals(a[i][j].substring(0,c[i].length()))){
                b[i]=true;                
            }
        }
        return cercaric(a, c, i, j+1, b);

        
    }
    public static void main(String[] args) {
        String [][] a = {{"cappello","","bozza"},{"carota","carro"},{"su","pericolo","sopra","pero"}};
        String [] c = {"appello","caro","per"};
        boolean [] b = new boolean [a.length];
        b=cercaric(a,c);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}