package programmers;

import java.util.*;
import java.util.Map.Entry;

public class Main42578 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//¿ß¿Â
	//https://programmers.co.kr/learn/courses/30/lessons/42578
static	class Solution {
	    public int solution(String[][] clothes) {
	        int answer = 1;
	        HashMap<String,Integer> map =  new HashMap<String, Integer>();
	        
	        for(String[] now : clothes)
	        	map.put(now[1] , map.getOrDefault(now[1], 1)+1);
	        
	        
	       Set<Entry<String,Integer>> entrySet = map.entrySet();
	       
	       
	       for(Entry<String,Integer> tmp : entrySet) {
	    	   //System.out.println(tmp.getKey() + " " + tmp.getValue());
	    	   answer *= tmp.getValue();
	       }

    	   return answer -1;
	    }
	}
}

