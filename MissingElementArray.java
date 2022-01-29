package mavenproject;

import java.util.Arrays;

public class MissingElementArray {
	
		public static void main(String[] args) {
			int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
			Arrays.sort(arr);
	for(int i=arr[0];i<arr.length;i++) {
		if(arr[i]-arr[i-1]!=1) {
			int missingnumb=arr[i-1]+1;
			System.out.println(missingnumb);
		}
	}
		}
}