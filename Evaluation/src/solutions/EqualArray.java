package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("1st array length");
		int length1=input.nextInt();
		int nums1[]=new int[length1];
		
		for(int index=0;index<length1;index++) {
			nums1[index]=input.nextInt();
		}
		
		System.out.println("2nd array length");
		int length2=input.nextInt();
		int nums2[]=new int[length1];
	
		for(int index=0;index<length2;index++) {
			nums2[index]=input.nextInt();
		}
		System.out.println(findEquality(nums1,nums2));
	}
	
	public static String findEquality(int[] nums1,int[] nums2){
		if(nums1.length !=nums2.length) {
			return "Not Equal";
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		for(int index=0;index<nums1.length;index++) {
			if(!(nums1[index]== nums2[index])) {
				return "Not Equal";
			}
		}
		
		return "Equal";
	}

}
