package Recursion;


import java.util.ArrayList;
import java.util.Collections;


public class combinationII {
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> sublist = new ArrayList<>();

        Collections.sort(arr);

        solve(res,sublist,arr,target,0);

        return res;
    }

    public static void solve(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> sublist,ArrayList<Integer> arr, int target, int i ){
        if(target<0) return;
        else if(target == 0){
            res.add(new ArrayList<>(sublist));
            return;
        }
        else{
            for(int j=i; j<arr.size(); j++){
                if(j>i && arr.get(j)==arr.get(j-1)) continue;
                    sublist.add(arr.get(j));
                    solve(res, sublist, arr, target - arr.get(j), j+1);
                    sublist.remove(sublist.size()-1);
                
            }
        }
    }
}

