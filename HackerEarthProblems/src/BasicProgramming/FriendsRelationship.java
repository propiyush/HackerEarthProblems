package BasicProgramming;

import java.io.IOException;
import java.util.Scanner;

public class FriendsRelationship {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        try{
        int t = sc.nextInt();
        while(t>0){
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{	
			System.out.print("*");
			}
			for(int j=i+1; j<=(2*n - i); j++)
			{
				System.out.print("#");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
        t--;
        }
        sc.close();
        }catch(Exception e){return;}
	}	
}
