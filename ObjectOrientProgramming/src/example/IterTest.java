package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class IterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(1);
		
		list.sort( (i, j) -> i.compareTo(j));
		
		for(int i : list)
			System.out.println(i);
		
		
		List<User> list2 = new ArrayList<>();
		
		//생성자를 람다로 만들어보자..
		
		BiFunction<Integer, Integer, User> userMaker = (h ,w) -> new User(h,w);
		BiFunction<Integer, Integer, User> userMaker2 = User::new;
	
		
		list2.add( userMaker.apply(187, 99));
		list2.add( userMaker.apply(155, 50));
		list2.add( userMaker.apply(167, 65));
		list2.add( userMaker2.apply(178, 68));
		list2.add( userMaker2.apply(174, 72));
		
		for(User i :list2)
			System.out.println(i.getHeight() + " " +i.getWeight());
		System.out.println();

		final Function<User,Integer> weightFunction = (User) -> User.getWeight();
		final Function<User,Integer> heightFunction = (User) -> User.getHeight();
		list2.sort(Comparator
				.comparing(heightFunction)
				.reversed()
				.thenComparing(weightFunction));
		
		for(User i :list2)
			System.out.println(i.getHeight() + " " +i.getWeight());
		
		//익명 클래스를 이용한 전달.
		list2.sort(new Comparator<User>() {
			
			@Override
			public int compare(User o1,User o2) {
				
				if(o1.getHeight() == o2.getHeight())
					return o1.getWeight() - o2.getWeight();
				else
					return o2.getHeight() -o1.getHeight();
			}
			
		});
		
		
		
		//Sort의  Comparator 의 compare함수에 람다식을 전달
		list2.sort((o1, o2)->o1.getHeight().compareTo(o2.getHeight()));
		
		//매서드 참조를 이용한 전달.
		list2.sort(User::Mycomparator);
		
		
		
		
		//Stream 을 통해 sorted 된 새로운 리스트 생성하기.
		
		
		
	}
	
public static class User{


	public Integer height;
	public Integer Weight;
	
	public User(int height , int weight) {
		this.height =height;
		this.Weight = weight;
	}
	
	
		public Integer getHeight() {
		return height;
	}

	public Integer getWeight() {
		return Weight;
	}
		
		
		public Integer Mycomparator(User o) {
			if( this.height == o.height)
				return this.height - o.height;
			return o.height - this.height;
		}
	}
	

}
