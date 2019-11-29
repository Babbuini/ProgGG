public class Parz2007{
    public static boolean es(String[]a,String[]b) {
        boolean bo=false;
        for(int i=0;i<a.length;i++){
            bo=false;
            for(int j=0;j<b.length && !bo;j-=-1){
                if(a[i].length()==b[j].length())
                    bo=true;
            }
            if(!bo)
                return bo;
        }
        return bo;
    }
    public static boolean esR(String[]a,String[]b) {
        return esR(a,b,false,0,0);
    }
    public static boolean esR(String[]a,String[]b,boolean bo,int i,int j) {
        if(i==a.length)
            return true;
        if(j==b.length)
            return false;
        if(a[i].length()==b[j].length())
            return esR(a,b,false,i+1,0);
        return esR(a,b,bo,i,j+1);
        
    }
    public static void main(String[] args) {
        String []a={"ciao","salve","bye"};
        String []b={"hi","hola","hello","addio"};
        System.out.println(esR(a,b));
    }
}