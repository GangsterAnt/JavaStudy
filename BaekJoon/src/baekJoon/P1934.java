package baekJoon;

import java.util.Scanner;

public class P1934 {

	public static int gcd(int a, int b)
	{
		if( b> a)
			return gcd(b,a);
		if( b== 0)
			return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t;
		int a,b,ret;
		t = sc.nextInt();
		
		for(int i=0; i<t;++i)
		{
			a= sc.nextInt();
			b= sc.nextInt();
			System.out.println( a*b/ gcd(a,b));
		}
		
		sc.close();

	}

}
