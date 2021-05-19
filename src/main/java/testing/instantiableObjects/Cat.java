package testing.instantiabelObjects;

public class Cat extends Animal{

	private final String name;
	private final String gender;
	private int age;

	Cat(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public boolean hasClaws(){
		return true;
	}

	public String setAge(int age){
		this.age = age;
		return "This cat's age is now ".append(this.age);
	}
}
