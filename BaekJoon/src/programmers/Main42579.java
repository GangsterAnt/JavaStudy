package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//º£½ºÆ®¾Ù¹ü
//https://programmers.co.kr/learn/courses/30/lessons/42579
public class Main42579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	static class Solution {
		
	    public int[] solution(String[] genres, int[] plays) {
	       HashMap<String, Object> musicMap = new HashMap<String, Object>();
	       HashMap<String,Integer> playPerGenre = new HashMap<String, Integer>();
	       ArrayList<Integer> ret = new ArrayList<Integer>();
	       
	       for(int i=0; i< genres.length; ++i) {
	    	   String key = genres[i];
	    	   HashMap<Integer,Integer> songInGenre;
	    	   
	    	   if(musicMap.containsKey(key)) {
	    		   //About Music
	    		   songInGenre = (HashMap<Integer, Integer>) musicMap.get(key);
	    		   //Update Genre's play times;
	    		   playPerGenre.put(key, playPerGenre.get(key) + plays[i]);
	    	   }
	    	   else {
	    		   //About Music
	    		   songInGenre = new HashMap<Integer, Integer>();
	    		   //Update Genre's play times
	    		   playPerGenre.put(key, plays[i]);
	    	   }
	    	   
	    	   songInGenre.put(i, plays[i]);
	    	   musicMap.put(key, songInGenre);
	    	   
	    	 }
	     //Have to Sort Genre with Descending order
	       Iterator iter = sortByValue(playPerGenre).iterator();
    	   //pick 2 at max from Genre order
    	   
    	   while(iter.hasNext()) {
    		   String key = (String) iter.next();
    		   Iterator songIter = sortByValue( (HashMap<Integer, Integer>)musicMap
    				   .get(key)).iterator();
    		   
    		   for(int j =0; j<2;++j) {
    			   if(songIter.hasNext())
    				   ret.add((Integer) songIter.next());
    		   }
    			   
    	   }
	    	
    	   
	    	
	    	int ans[] = new int[ret.size()];
	    	
	    	for(int j=0; j< ret.size();++j)
	    		ans[j] = ret.get(j);
	       return ans;
	    }
	    
	    private ArrayList sortByValue(final Map map) {
			ArrayList<Object> keyList = new ArrayList();
			keyList.addAll(map.keySet());
			
			Collections.sort(keyList, new Comparator(){

				@Override
				public int compare(Object o1, Object o2) {
					Object v1 = map.get(o1);
					Object v2 = map.get(o2);
					
					return ((Comparable)v2).compareTo(v1);
				}
			});
	    	return keyList;
	    }
	   
	}
	
}
