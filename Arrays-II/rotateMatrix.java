class Solution {
    public void rotate(int[][] arr) {
        

    // up to down swap
     for(int idx = 0; idx<arr.length; idx++)
     { 
        int i=0;
        int j=arr.length - 1;
        while(i<j){
          int temp = arr[i][idx];
          arr[i][idx] = arr[j][idx];
          arr[j][idx] = temp;
          i++;
          j--;
        }      
      }

      // diagonally swap
      for(int k=0; k<arr.length; k++){
        for(int l=k; l<arr.length; l++){
          int temp = arr[l][k];
          arr[l][k] = arr[k][l];
          arr[k][l] = temp;
        }
      }
    }
}