package baekJoon;

import java.io.IOException;
import java.util.Scanner;

public class P10430 {

	 public static void main(String[] args) throws IOException {
	       
	    	Scanner sc = new Scanner(System.in);
	    	int A = sc.nextInt();
	    	int B= sc.nextInt();
	    	int C= sc.nextInt();
	    	
	    	sc.close();
	    	
	    	int[] result = new int[4];
	    	result[0] =  (A+B)%C;
	    	result[1] = ((A%C) + (B%C))%C;
	    	result[2] = (A*B)%C;
	    	result[3] = ((A%C) * (B%C))%C;
	    	
	    	for(int i=0; i< 4; ++i)
	    		System.out.println(result[i]);
	    	
	    	return ;
	 }
}
