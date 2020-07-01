package DataStructures;
import java.util.Scanner;


public class HamiltonianAndLagrangian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

	//	boolean flag = true;
		
		for(int i=0; i<n-1; i++)
		{
			boolean flag=true;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]>arr[i])
				{
					flag=false;
					break;
				}
			}
			if(flag) System.out.println(arr[i]);
		}
		System.out.println(arr[n-1]);
		
	}

}
