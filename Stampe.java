public class Stampe{
    public static void stampa(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void stampa(char[] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void stampa(String[] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void stampa(boolean[] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void stampa(int[][] a) {
        for(int i=0;i<a.length;i++){            
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void stampa(boolean[][] a) {
        for(int i=0;i<a.length;i++){            
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void stampa(char[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void stampa(String[][] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}