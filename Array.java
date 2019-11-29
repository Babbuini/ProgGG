class Array{
    public static void main(String[] args) {
        int[][]b= new int[7][];
        for (int i = 0; i < b.length; i++) {
            b[i]=new int [i+1];
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]=i+j;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}