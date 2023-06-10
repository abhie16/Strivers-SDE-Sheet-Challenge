class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
      int[] l = new int[m];
      int[] r = new int[n];
        
        for(int i=0; i<m; i++){
            l[i] = a[i];
        }
        for(int i=0; i<n; i++){
            r[i] = b[i];
        }
         int i=0, j=0;
        
        int k=0;
        
      while(i<m && j<n){
         if(l[i]<=r[j]){
           a[k]=l[i];
           i++;
          }
          else{
              a[k]=r[j];
              j++;
          }
          k++; 
      }
        
        while(i<m){
            a[k]=l[i];
            i++;
            k++;
        }
        while(j<n){
            a[k]=r[j];
            j++;
            k++;
        }
    }
}