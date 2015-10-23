import java.lang.reflect.Array;

public class Main {
    public static void main (String []args) {
        int [] cifry = {25, 487, 21, 98, 347};
        for (int i=0; i<cifry.length-1; i++ ) {
            int p = cifry[i];
            int d = getMin(cifry, i+1);
            if (p > cifry[d]){
                swap(cifry, d, i);

            }
        }
    }

    public static int getMin(int[] arr, int startIndex) {
        int j= startIndex;
        for (int i=startIndex+1; i<arr.length; i++) {
             if (arr[i] < arr[j]){
                 j=i;

             }
        }
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int g = arr[i];
        arr[i]= arr[j];
        arr[j]= g;
    }
}
