package api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

	static String solution(String[] arr1, String[] arr2) {
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		for(int i=0; i<arr2.length; i++) {
			if(!arr1[i].equals(arr2[i]))
				return arr1[i];
		}
		return arr1[arr1.length-1];
	}
	
	public static void main(String[] args) {
		
		
		String[] participant = {"mislav","stanko","mislav","ana"};
		String[] completion = {"stanko","ana","mislav"};
		
		System.out.println(solution(participant, completion));
		
		
	}
}
