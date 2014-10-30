package dogs;

public class Dog {
	int birthYear;
	String breed;
	String color;
	String name;
	int health;

	public void woofWoof() {
		System.out.print("Woof Woof my name is " + name + " My color is "
				+ color + " I am " + breed + " I was born" + birthYear + "\n");

	}

	public void printHealth() {
		System.out.print(" \n " + name + " ");
		int counter = 0;
		while (counter < health) {
			System.out.print("|");
			counter = counter + 1;
		}
	}
	
	
}
