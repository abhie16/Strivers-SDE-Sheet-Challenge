
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		int index = -1;
		int n = arr.size();

		for(int i=n-2; i>=0; i--){
			if(arr.get(i) < arr.get(i+1)){
				index=i;
				break;
			}
		}

		if(index == -1){
			Collections.reverse(arr);
			return arr;
		}

		for(int i=n-1; i>index; i--){
			if(arr.get(i) > arr.get(index)){
				int temp = arr.get(index);
				arr.set(index, arr.get(i));
				arr.set(i,temp);
				break;
			}
		}

		int low = index+1;
		int high = arr.size()-1;

		while(low<high){
			int temp = arr.get(low);
				arr.set(low, arr.get(high));
				arr.set(high,temp);

				low++;
				high--;
		}
		return arr;
	}
}
