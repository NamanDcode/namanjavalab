class Dog
{
	String Name;
	String Breed;
	public Dog(String Name,String Breed) {
		this.Name=Name;
		this.Breed=Breed;
	}
	void Display() {
		System.out.println(Name);
		System.out.println(Breed);
	}
}



public class Problem2 {

	public static void main(String[] args) {
	Dog D1=new Dog("Muffy","Pitbull");
	D1.Display();
	Dog D2=new Dog("jerry","pug");
	D2.Display();
	String Tem1=D1.Name;
	String Tem2=D1.Breed;
	D1.Name=D2.Name;
	D1.Breed=D2.Breed;
	D2.Name=Tem1;
	D2.Breed=Tem2;
	D1.Display();
	D2.Display();

	}

}
