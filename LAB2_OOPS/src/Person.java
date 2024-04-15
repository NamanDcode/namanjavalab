class Persons
{
	String Name;
	int Age;
	public Persons(String Name,int Age) {
		this.Name= Name;
		this.Age=Age;
	}
	void Display() {
		System.out.println(Name);
		System.out.println(Age);
	}
}

public class Person {

	public static void main(String[] args) {
	Persons P1= new Persons("Naman",23);
	P1.Display();
	Persons P2= new Persons("Ajay",57);
	P2.Display();
	}
	
}
