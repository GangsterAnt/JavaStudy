package hello;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	
		int m;
		String s;
		String cmd;
		int val = 0;
		
		// 1 to 20 ( 21)
		boolean [] list = new boolean[21];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// nextInt 를 사용하면 line 의 개행을 제거해 주지 않는다. 그러므로 추가연산..
		m = Integer.parseInt(br.readLine());
		
		for(int i=0; i< 21;++i)
			list[i] = false;
		
		for(int i=0; i< m; i++)
		{
			//System.out.println(s);
			StringTokenizer st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			
			if( cmd.equals("empty"))
			{	for(int j=0; j <21;++j)
					list[j] = false;
			}
			else if (cmd.equals("all"))
			{	for(int j=0; j <21;++j)
					list[j] = true;
			}
			else
			{
				val = Integer.parseInt(st.nextToken());
				
				if( cmd.equals("add"))
					list[val] = true;
				
				else if( cmd.equals("remove"))
					list[val] = false;
				
				else if( cmd.equals("check"))
				{
					if(list[val])
						System.out.println("1");
					else
						System.out.println("0");
				}
				else if(cmd.equals("toggle"))
					list[val] = (list[val] == true) ? false : true;
				
			}
			
		}
	}
}
	
		
