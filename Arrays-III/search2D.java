import java.util.ArrayList;

public class search2D {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int m = mat.get(0).size();
        int n = mat.size();
        int low = 0;
        int high = m*n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(mat.get(mid/m).get(mid%m) == target) return true;
            else if(mat.get(mid/m).get(mid%m) > target) high = mid-1;
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
