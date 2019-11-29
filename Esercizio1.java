class Esercizio1 {
    

    public static void main(String[] args) {
        
        // char[] c = {'a', 'b', 'c', 'd'};
        // String s = "daacbbaa";
        // int v = 5;

        char[] c = {'y', 'r', 'z'};
        String s = "rzzrrz";
        int v = 4;

        char[] a = c;
        int i = 0, j = 0, k = 0;
        boolean p = false;

        System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "k: " + k +" - "+ "p: " + p);

        for (i = 0; i < a.length; i++) {
            j = 0;
            k = 0;
            p = false;
            System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "k: " + k +" - "+ "p: " + p);
            while ( j < s.length() && !p) {
                if ( s.charAt(j) != a[i]) {
                    k++;
                    if ( k == v ) {
                        a[i] = '*';
                        p = true;
                        System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "k: " + k +" - "+ "p: " + p);
                    } 
                }
                j++;
                System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "k: " + k +" - "+ "p: " + p);
            }
        }
        System.out.println("Soluzione:");
        System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "k: " + k +" - "+ "p: " + p);

        for (int ch = 0; ch < a.length; ch++) {
            System.out.println("a"+"["+ch+"] = " + a[ch]);
        }
    } 
}