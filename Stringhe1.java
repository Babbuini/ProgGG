class Stringhe1{
    public static void main(String[] args) {//cercare di capire cosa esce
        String t="palazzo";
        char c='z';
        String s = t, s1="";
        int k = 0; 
        while (k<s.length()) {
            if (s.charAt(k)!=c) {
                s1=s1+s.charAt(k);
            }
            else{
                s1=c+s1;
            }
            k++;
        }
        System.out.println(k+"  "+s1);
    }        
}
