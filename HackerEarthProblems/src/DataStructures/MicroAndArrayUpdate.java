package DataStructures;
import java.io.*;
import java.util.Scanner;


public class MicroAndArrayUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        try{
        int t = sc.nextInt();
        
        while(t-->0) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
        	a[i] = sc.nextInt();
        }
        java.util.Arrays.sort(a);
        if(a[0] >= k) System.out.println(0);
        else
        System.out.println((int)Math.abs(k-a[0]));
        }
        }catch(Exception e) {
        	return;
        }
		
	}

}
