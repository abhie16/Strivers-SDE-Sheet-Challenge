public class majority {
	public static int findMajority(int[] arr, int n) {
		if(arr.length == 1) return arr[0];
		Arrays.sort(arr);
		int a = arr[0];
		int count =0;
		for(int i=0; i<n-1; i++){
			if(arr[i+1] == arr[i]) count++;
			if(count==n/2) return arr[i];
			else if(arr[i+1] != arr[i]) count=0;
		}

		return -1;
	}
}
