package BasicProgramming;
import java.util.Scanner;

public class SeatingArrangment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s="";
            int num=0;
            int n=sc.nextInt();
            if(n%12==0)
            {
                s=s+"WS";
                num=n-11;
            }
            else if(n%12==1)
            {
                s=s+"WS";
                num=n+11;
            }
            else if(n%12==2)
            {
                s=s+"MS";
                num=n+9;
            }
            else if(n%12==3)
            {
                s=s+"AS";
                num=n+7;
            }
            else if(n%12==4)
            {
                s=s+"AS";
                num=n+5;
            }
            else if(n%12==5)
            {
                s=s+"MS";
                num=n+3;
            }
            else if(n%12==6)
            {
                s=s+"WS";
                num=n+1;
            }
            else if(n%12==7)
            {
                s=s+"WS";
                num=n-1;
            }
            else if(n%12==8)
            {
                 s=s+"MS";
                num=n-3;
            }
            else if(n%12==9)
            {
                s=s+"AS";
                num=n-5;
            }
            else if(n%12==10)
            {
                s=s+"AS";
                num=n-7;
            }
            else if(n%12==11)
            {
                s=s+"MS";
                num=n-9;
            }
            System.out.println(num+" "+s);
        }
        sc.close();
	}

}
