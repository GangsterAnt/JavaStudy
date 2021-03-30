package hello;

import java.util.*;
import java.util.stream.*;

public class StreamTest {

	public static void main(String[] args) {
		String[][] namesArray = new String[][]{
	        {"kim", "taeng"}, {"mad", "play"},
	        {"kim", "mad"}, {"taeng", "play"}};

	Set<String> namesWithFlatMap = Arrays.stream(namesArray)
	        .flatMap(innerArray -> Arrays.stream(innerArray))
	        .filter(name -> name.length() > 3)
	        .collect(Collectors.toSet());
	
	List<Stream<String>> lst= Arrays.stream(namesArray)
			.map(innerArray -> Arrays.stream(innerArray))
			.collect(Collectors.toList());
	
	System.out.println(lst.size());
	
	for(int i =0; i< lst.size();++i)
	System.out.println(lst.get(i));

	}

}
