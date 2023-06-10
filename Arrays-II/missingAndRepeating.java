import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        long s2 = (n*(n+1)*(2*n+1))/6;
        long s = (n*(n+1))/2;

        long sn = 0;
        long sn2 = 0;
        for(int i=0; i<n; i++){
            sn += arr.get(i);
            sn2 += (long)arr.get(i) * (long)arr.get(i);
        }
        
        long xMy = sn-s;
        long xPy = (sn2 - s2)/xMy;

        long x =((xMy+xPy)/2);
        long y = (x-xMy); 

        int[] a = {(int)y,(int)x};

        return a;
    }
}