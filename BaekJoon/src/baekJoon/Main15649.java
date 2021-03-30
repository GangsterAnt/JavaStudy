import java.util.ArrayList;
import java.util.Scanner;

public class Main15649 {

	private static Integer n, depth;
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	private static boolean[] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // °¹¼ö
		depth = sc.nextInt(); //±æÀÌ 
		
		visited = new boolean[n.intValue()+1];
		
		dfs(0);
		
		return;
	}
	
	private static void dfs(int now) {
		
		if( now == depth.intValue()){
			for(int i :list)
				System.out.print(i+" ");
			System.out.println();
			return;
		}
		
		for( int i=1; i<= n.intValue(); ++i) {
			if(!visited[i]) {
				visited[i] = true;
				list.add(i);
				dfs(now+1);
				visited[i] = false;
				list.remove(list.size()-1);
			}
		}
		
	}

}
