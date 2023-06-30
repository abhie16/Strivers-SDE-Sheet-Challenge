
import java.util.ArrayList;
public class reversepairs {

public class Solution 
{
    public static int countPairs(int[] arr, int low, int mid, int high){
        int right = mid + 1;
        int count = 0;
        for(int i=low; i<=mid; i++){
            while(right<=high && (long)arr[i]>(long)2*arr[right]) right++;
            count += (right - (mid+1));
        }
        return count;
    }
    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high)/2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int l[] = new int[n1];
        int r[] = new int[n2];

        for(int i=0; i<n1; i++){
            l[i] = arr[low+i];
        }
        for(int j=0; j<n2; j++){
            r[j] = arr[mid+1+j];
        }

        int i=0, j=0;
        int k=low;

        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                arr[k] = l[i];
                i++;
            }
            else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while(i<n1){
           arr[k] = l[i];
                i++;
                k++;
        }
        while(j<n2){
            arr[k] = r[j];
            j++;
            k++;
        }
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        int[] nums = new int[arr.size()];

        int i = 0;

        for(int num : arr){

        nums[i++] = num;

        }

        return mergeSort(nums, 0, nums.length-1);
    }
}
}
