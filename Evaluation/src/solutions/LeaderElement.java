package solutions;

import java.util.Scanner;

public class LeaderElement {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		int nums[]=new int[length];
		
		for(int index=0;index<length;index++) {
			nums[index]=input.nextInt();
		}
		System.out.println("Leader elements are:"+findLeader(nums));
	}
	
	public static String findLeader(int[] nums) {
		int max=nums[nums.length-1];
		StringBuilder leadersb=new StringBuilder();
		for(int index=nums.length-2;index>=0;index--) {
			if(nums[index]>max) {
				leadersb.append(max).append(" ");
				max=nums[index];
			}
		}
		leadersb.append(max);
		return leadersb.toString();
	}
	
}
