package BasicProgramming;
import java.util.Scanner;

public class Zoos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int countx=0;int county=0;
		for(char c : str.toCharArray())
		{
			if(c == 'z') countx++;
			else county++;
		}
		if(2*countx == county)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}

}
