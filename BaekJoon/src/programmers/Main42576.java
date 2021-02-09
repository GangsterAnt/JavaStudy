package programmers;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//완주하지 못한 선수
public class Main42576 {

	public static void main(String[] args) {
		Solution ans = new Solution();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = { "stanko", "ana", "mislav"};
		
		System.out.println(ans.solution(participant, completion));

		System.out.println("Done");
	}

	static class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        HashMap<String,Integer> m = new HashMap<String,Integer>();
	        
	        /*
	        for(String temp : completion) {
	        	if(m.containsKey(temp))
	        		m.replace(temp, m.get(temp).intValue()+1);
	        	else
	        		m.put(temp, 1);
	        }
	        */
	        for(String temp : participant)
	        	m.put(temp, m.getOrDefault(temp, 0)+1);
	        
	        /*
	        for(String temp :participant) {
	        	if(m.containsKey(temp)) {
	        		if(m.get(temp).intValue() == 0) {
	        			return temp;
	        		}
	        		else {
	        			m.replace(temp, m.get(temp).intValue()-1);
	        		}
	        	}
	        	else
	        		return temp;
	        }
	        */
	        
	        
	        for(String temp : completion) 
	        	m.put(temp, m.get(temp)-1);
	        	
	        //v1
	        /*
	        for(String key :m.keySet())
	        	if(m.get(key) != 0)
	        		return key;
	        */
	        //v2

	        Set<Entry<String, Integer>> entrySet = m.entrySet();
	        for(Entry<String,Integer> tmp : entrySet)
	        	if(tmp.getValue() != 0)
	        		return tmp.getKey();
	        
	        return answer;
	    }
	}
}
