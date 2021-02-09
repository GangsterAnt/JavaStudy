package hello;

import java.util.*;

public class User {

	private int height;
	private int weight;
	
	public User(int height, int weight) {
		
		this.height = height;
		this.weight = weight;
	}
	
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}

	public int heightDiff(final User other ) {
		return this.height - other.height;
	}

	
	
	public static void main(String[] args) {
		
		ArrayList <User> list = new ArrayList();
		
		list.add(new User(170,50));
		list.add(new User(174,50));
		list.add(new User(200,50));
		list.add(new User(150,65));
		
		list.add(new User(175,50));
		
		list.add(new User(195,50));

		list.add(new User(175,60));
		
		list.add(new User(173,50));
		list.add(new User(179,50));
		list.add(new User(201,50));
		list.add(new User(152,65));
		
		list.add(new User(175,55));
		
		//Collections.sort(list, new MyComparator());
		//list.sort(new MyComparator());
		
		
		
		list.sort(Comparator.comparing(User::getHeight));
		
		
		for(User i : list)
			System.out.println("Height : "+  i.getHeight()+" And Weight : "+ i.getWeight());

	}	



public int compareTo(Object o) {
    return Comparator
            .comparing(User::getHeight)
            .thenComparing(User::getWeight)
            .compare(this, (User) o);
  }

}


class MyComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		if(o1.getHeight() <o2.getHeight())
			return 1;
		return -1;
	}
}
