package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
        public static ArrayList<Integer> subsetSum(int num[]) {
            ArrayList<Integer> ans = new ArrayList<>();
            subset(ans,num,0,0);
            Collections.sort(ans);
            return ans;
        }
    
        public static void subset(ArrayList<Integer> ans, int[] num, int i, int sum){
            if(i==num.length){
                ans.add(sum);
                return;
            }
    
            subset(ans, num, i+1,sum+num[i]);
            subset(ans, num, i+1, sum);
        }
}
