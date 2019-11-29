class Esercizio3 {
    

    public static void main(String[] args) {

        int[][] b = {{7,2},{},{8,-1,-9},{8,5,-2,15},{9,6,10}};
        int k = 12;


        int[][] a = b;
        int i = 0, j = 0;
        boolean p  = false;
        String t = "*";

        System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "p: " + k +" - "+ "t: " + t);

        while ( i < a.length && !p) {
            for ( j = 0; j < a[i].length - 1; j++) {
                if ( a[i][j] + a[i][j + 1] >= k) {
                    t = t + a[i][j] + t;
                    p = true;
                    System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "p: " + k +" - "+ "t: " + t);
                }
            }
            i++;
            System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "p: " + k +" - "+ "t: " + t);
        }
    
        System.out.println("i: " + i + " - "+ "j: " + j + " - "+ "p: " + k +" - "+ "t: " + t);
    }
}