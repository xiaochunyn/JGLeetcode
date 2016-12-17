package two_sum;

import java.util.*;

public class TwoSum{
	public static void main(String[] args){
		int[] arr = {2, 7, 11, 15};
		int target = 9;

		int[] result = Solution(arr, target);
		System.out.println(result[0] + "***" + result[1]);

		System.out.println("Hello Sublime!");
	}

	public static int[] Solution(int[] arr, int target){
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < arr.length; i++){
			if(map.containsKey(target - arr[i])){
				result[1] = i;
				result[0] = map.get(target - arr[i]);
				return result;
			}
			map.put(arr[i], i );
		}
		return result;
	}

}