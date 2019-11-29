public class MaxArray{
    public static int massimo(int[]a) {
        //int[] a = {5,4,2,6,9,8,2,0};
        int max = a[0], i;
        for(i=1; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            } 
        }
        return max;
    }      
}
