package programmers;

import java.util.Arrays;

public class Main42577 {

	public static void main(String[] args) {
		Solution sol = new Solution();

	}
	

static	class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        Arrays.sort(phone_book);
	        for(int i=1; i<phone_book.length; ++i) {
	        	String a = phone_book[i-1];
	        	String b = phone_book[i];
	        	
	        	if(b.startsWith(a))
	        		return false;

	        }
	        	
	        
	        return true;
	    }
	}

}

