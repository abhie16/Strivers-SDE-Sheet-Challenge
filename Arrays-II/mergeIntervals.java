import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));

        for(int i=0; i<arr.length; i++){
            int start = arr[i][0];
            int end = arr[i][1];

            if(ans.size()!=0 && end <= ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j=i+1; j<arr.length; j++){
                if(arr[j][0] <= end){
                    end = Math.max(arr[j][1], end);
                }
                else{
                    break;
                }
            }
            ArrayList<Integer> ls = new ArrayList<>();
            ls.add(start);
            ls.add(end);
            ans.add(ls);
        }

        int mat[][] = new int[ans.size()][2];

        for(int i=0; i<ans.size(); i++){
            mat[i][0] = ans.get(i).get(0);
            mat[i][1] = ans.get(i).get(1);
        } 

        return mat;
    }
}