package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetII {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);

        solve(ans, temp, arr, 0);

        return ans;
    }
    public static void solve(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp, int[] arr, int start){
        ans.add(new ArrayList<>(temp));

        for(int i=start; i<arr.length; i++){
            if(i>start && arr[i-1] == arr[i]) continue;

            temp.add(arr[i]);
            solve(ans,temp,arr,i+1);
            temp.remove(temp.size()-1);
        }

        
    }
}
