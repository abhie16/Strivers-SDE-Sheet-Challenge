package String;

import java.util.Arrays;

public class longestCommonprefix {
	public static String longestCommonPrefix(String[] arr, int n) {
		Arrays.sort(arr);

		String start = arr[0];
		String last = arr[arr.length-1];

		int c = 0;

		while(c<start.length()){
			if(start.charAt(c) == last.charAt(c)){
				c++;
			}
			else{
				break;
			}
		}

		return c==0?"":start.substring(0,c);
	}

}
