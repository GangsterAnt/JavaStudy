package baekJoon;

import java.util.Scanner;

public class P2069 {

	public static int gcd(int a, int b)
	{
		if( b> a)
			return gcd(b,a);
		if( b == 0)
			return a;
		return gcd( b, a%b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int gcdNum = gcd(a,b);
		int lcmNum = a* b /gcdNum;
		
		System.out.println(gcdNum);
		System.out.println(lcmNum);
	}
}
