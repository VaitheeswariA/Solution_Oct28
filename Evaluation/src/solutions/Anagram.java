package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
	static HashMap<Integer,Integer> ans=new HashMap<>();
	static int prime[]= {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String given=input.nextLine();
		String answer="";
		int count=0;
		subseq(answer,given);
		System.out.println(ans);
		for(Map.Entry<Integer,Integer> each_char:ans.entrySet()) {
			if(each_char.getValue()==2) {
				count++;
			}
		}
		System.out.println(count);
	}
	static void subseq(String processed,String unprocessed)
	{
		if(unprocessed.isEmpty())
			{
				System.out.println(processed);
				int product=1;
				for(char c:processed.toCharArray()) {
					product*=prime[c-97];
				}
				ans.put(product,ans.getOrDefault(product,0)+1);
				return;
			}
		char ch=unprocessed.charAt(0);
		
		subseq(processed+ch,unprocessed.substring(1));
		subseq(processed,unprocessed.substring(1));
		
	}
	
}
