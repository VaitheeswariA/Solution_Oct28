package solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurence {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		int nums[]=new int[length];
		
		for(int index=0;index<length;index++) {
			nums[index]=input.nextInt();
		}
		System.out.println("enter minimum occurence:");
		int k=input.nextInt();
		System.out.println(findOccurence(nums,k));

	}
	
	public static int findOccurence(int[] nums,int k) {
		HashMap<Integer,Integer> frequency=new HashMap<>();
		
		for(int index=0;index<nums.length;index++) {
			frequency.put(nums[index], frequency.getOrDefault(nums[index], 0)+1);
			if(frequency.get(nums[index])>=k) {
				return nums[index];
			}
		}
		return -1;
	}

}
