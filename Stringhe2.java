class Stringhe2{
    public static void main(String[] args) {
        String[] b={"ccd","hk","priiccv","dzaaf","shdvboosjk"};
        String[] a=b;
        int i=0,j=0;
        boolean p;
        String s="";
        for(i=0;i<a.length;i++){
            j=1;
            p=false;
            while (j<a[i].length() && !p) {
                if (a[i].charAt(j-1)==a[i].charAt(j)) {
                    p=true;
                } 
                else {
                    j++;    
                }
            }
            if(p) s=s+ a[i].charAt(j);            
        }
        System.out.println(s);
    }
}