package String;

public class reverseString{
   public static String reverseS(String s) {
        if(s==null) return null;

        char[] arr = s.toCharArray();
        int n = arr.length;

        reverse(arr,0,n-1);

        reverseWords(arr,n);

        return cleanSpaces(arr,n);
    }
    public static void reverseWords(char[] arr, int n){
        int i=0,j=0;

        while(i<n){
            while(i<j || i<n && arr[i] == ' ') i++; //skip spaces
            while(j<i || j<n && arr[j] != ' ') j++; //skip non spaces
            reverse(arr,i,j-1);
        }
    }

    public static String cleanSpaces(char[] arr, int n){
        int i=0, j=0;

        while(j<n){
            while(j<n && arr[j] == ' ') j++; //skip spaces
            while(j<n && arr[j] != ' ') arr[i++] = arr[j++]; //keep non spaces
            while(j<n && arr[j] == ' ') j++; //skip spaces
            if(j<n) arr[i++] = ' '; //keep one spaces;
        }

        return new String(arr).substring(0,i);
    }

    private static void reverse(char[] arr, int low, int high){
        while(low<=high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
