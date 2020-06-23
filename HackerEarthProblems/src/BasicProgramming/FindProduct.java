package BasicProgramming;


import java.io.IOException;
import java.util.Scanner;

public class FindProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long product = 1;
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextLong();
            product = product * arr[i]%1000000007;
		}
		
		System.out.println(product);
	}

}
