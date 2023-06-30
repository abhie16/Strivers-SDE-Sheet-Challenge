public class countInversion {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]) count++;
            }
        }

        return count;
    }
}
