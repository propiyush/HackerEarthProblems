package DataStructures;
import java.io.*;
import java.util.Scanner;


public class MonkAndWelcomeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        try{
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            c[i] = a[i]+b[i];
            System.out.print(c[i]);
        }
        sc.close();
        }catch(Exception e){
            return;
        }

	}

}
