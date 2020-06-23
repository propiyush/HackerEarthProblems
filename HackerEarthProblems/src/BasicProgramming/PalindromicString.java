package BasicProgramming;

import java.io.IOException;
import java.util.Scanner;

public class PalindromicString {

	
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int l = str.length()-1;
		
		int s = 0;
		
		boolean palindrome = true;
		while(s<l)
		{
			if(str.charAt(s++) != str.charAt(l--))
			{
				palindrome = false;
				break;
			}
		}
		if(palindrome)
		System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
