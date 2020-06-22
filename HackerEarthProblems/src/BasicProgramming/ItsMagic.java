package BasicProgramming;
import java.util.Scanner;


public class ItsMagic {
	
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		long sum = 0;
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		int min = 999999999;
        int index = -1;
		for(int i=0; i<n; i++)
		{
			if((sum-arr[i])%7==0) {
				if(arr[i]<min) {
					min=arr[i];
                    index = i;
				}
			}
		}
		System.out.println(index);	
		sc.close();
	}

}
