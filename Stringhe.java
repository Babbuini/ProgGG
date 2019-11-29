class Stringhe{
    public static void main(String[]args) {
        String stringa=args[0];
        String s = stringa, c="";
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='b'){
                c=c+s.charAt(i);
            }
        }        
        System.out.println(c);
    }
}