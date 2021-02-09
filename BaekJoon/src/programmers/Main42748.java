package programmers;

import java.util.*;

//K번째수
public class Main42748 {

	public static void main(String[] args) {
		
		int array[] = {1, 5, 2, 6, 3, 7, 4};
		int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Solution s = new Solution();
		System.out.println(s.solution(array,commands));

	}
	
	static class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[ commands.length];
	        
	        int i,j,k;
	        
	        Comparator<Integer> cmp = new Comparator<Integer>(){

				@Override
				public int compare(Integer o1, Integer o2) {
					if(o1>o2) return 1;	//이경우 swap 이 일어난다.
					if(o1<o2) return -1;
					return 0;
				}
	        	
	        };
	        
	        for(int a=0; a<commands.length;++a) {
	        	ArrayList<Integer> list = new ArrayList();
	        	i = commands[a][0]-1;
	        	j = commands[a][1]-1;
	        	k = commands[a][2]-1;
	        	for(;i<=j;++i)
	        		list.add(array[i]);
	        	//list.sort(new ListComparator());
	        	Collections.sort(list,cmp);
	        	answer[a] = list.get(k);
	        	
	        	/*
	        for(int a =0; a<commands.length;++a) {
	        	int tmp[] = Arrays.copyOfRange(array,commands[a][0]-1, commands[a][1]);
	        	Arrays.sort(tmp);
	        	answer[a] = tmp[commands[a][2]];
	        }
	        */
	        
	    }
	        return answer;
	}
}


	class ListComparator implements Comparator<Integer>{
		@Override
		public int compare(Integer a,Integer b){ //오름차순
			if(a>b) return 1;
			if(a<b) return -1;
			return 0;
		}
	} 
}
