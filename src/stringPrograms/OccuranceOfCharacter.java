package stringPrograms;

import java.util.Scanner;

public class OccuranceOfCharacter {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=scan.next();
		str=str.toLowerCase();
		int[] freq=new int[str.length()];
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='0';
				}
			}
			if(freq[i]!='0') {
				freq[i]=count;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='0' && freq[i]!='0') {
				System.out.println(arr[i]+"=="+freq[i]);
			}
		}
		scan.close();
	}

}
