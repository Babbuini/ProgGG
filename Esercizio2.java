class Esercizio2 {

    public static void main(String[] args) {

        //String[] b = { "ac", "", "g", "brbrbbbb", "xfff" };
        String[] b = {"hjh", "pgyg", "zttzt"};

        String[] a = b;
        int i = 0, j = 0;
        boolean q = true;
        String s = "";

        System.out.println("i: " + i + " - " + "j: " + j + " - " + "q: " + q + " - " + "s: " + s);

        while (i < a.length && q) {
            j = 1;
            while ( j < a[i].length() && q) {
                if (a[i].charAt(j - 1) != a[i].charAt(j)) {
                    s = s + a[i].charAt(j);
                    System.out.println("i: " + i + " - " + "j: " + j + " - " + "q: " + q + " - " + "s: " + s);
                }
                else {
                    q = false;
                    System.out.println("i: " + i + " - " + "j: " + j + " - " + "q: " + q + " - " + "s: " + s);
                }
                j++;
                System.out.println("i: " + i + " - " + "j: " + j + " - " + "q: " + q + " - " + "s: " + s);
            }
            i++;
            System.out.println("i: " + i + " - " + "j: " + j + " - " + "q: " + q + " - " + "s: " + s);

        }
        System.out.println("Soluzione:");
        System.out.println("i: " + i + " - " + "j: " + j + " - " + "q: " + q + " - " + "s: " + s);

        
    }

}