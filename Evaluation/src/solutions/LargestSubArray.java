package solutions;

import java.util.Scanner;

public class LargestSubArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		int nums[]=new int[length];
		for(int index=0;index<length;index++) {
			nums[index]=input.nextInt();
		}
		
		System.out.println(largestSubArray(nums));
	}
	
	public static int largestSubArray(int[] nums1) {
		int sum=0,count=0;
		for(int index=0;index<nums1.length;index++) {
			sum+=nums1[index];
		}
		if(sum==0) {
			return nums1.length;
		}
		for(int index1=0;index1<nums1.length-1;index1++) {
			sum=nums1[index1];
			for(int index2=index1+1;index2<nums1.length;index2++) {
				sum+=nums1[index2];
				if(sum==0) {
					count=count<(index2-index1)+1 ? (index2-index1)+1:count;
				}
			}
		}
		return count;
	}

}

/*for(int index=0;index<arraystr.size();index++) {
int product=1;
for(char c:arraystr.get(index).toCharArray()) {
	product*=prime[c-97];
}
ans.put(product, ans.getOrDefault(product, 0)+1);
}*/
