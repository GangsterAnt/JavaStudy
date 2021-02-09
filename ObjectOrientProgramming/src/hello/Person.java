package hello;

public class Person {

	int age;
	String name;
	boolean married;
	int child_num;
	
	public void info()
	{
		System.out.println("Age : "+ age);
		System.out.println("name : " + name);
		System.out.println("Married : " + married);
		System.out.println("Number of Child : "+ child_num);
		System.out.println();
	}
	
	public Person(int a, String b, boolean c, int d)
	{
		age = a;
		name = b;
		married = c;
		child_num = d;
	}
	public Person() 
	{}

	public static void main(String[] args) {
		
		Person james = new Person();
		Person kim = new Person(25, "Kim", false, 0 );
		james.age = 40;
		james.name = "James";
		james.married = true;
		james.child_num = 3;
		
		james.info();
		
		kim.info();
	}
	
}
