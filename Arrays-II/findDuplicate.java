import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            if(!set.add(n)){
                return n;
            }
        }

        return -1;
    }
}