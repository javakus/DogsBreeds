package dogs;

import java.util.Random;

public class DogsClass {
	public static void main(String[] args) throws InterruptedException {
		int n =5;
		String text = "Probni text";
		
		Dog kerina = new Dog();
		kerina.birthYear = 2006;
		kerina.name = "Snupi";
		kerina.color = "black";
		kerina.breed = "bullMastif";
		kerina.health = 100;
		
		Dog dzukac = new Dog();
		dzukac.birthYear = 2009;
		dzukac.name = "Vucko";
		dzukac.color = "brown";
		dzukac.breed = "germanShepard";
		dzukac.health = 100;
		
		kerina.woofWoof();
		dzukac.woofWoof();
		
		kerina.printHealth();
		dzukac.printHealth();
		
		fight(kerina, dzukac);
	}
	
	public static void fight(Dog dog1, Dog dog2 ) throws InterruptedException{
		
		Random randomDog = new Random();
		Random randomDamage = new Random();
		
		while (dog1.health > 10 && dog2.health > 10){
			
			int damage = randomDamage.nextInt(12);
			int attack = (int) ( Math.random() * 2 + 1); // will return either 1 or 2
			if(attack == 1){
				dog2.health = dog2.health -damage;
			}else{
				dog1.health = dog1.health -damage;
			}
			
			dog1.printHealth();
			dog2.printHealth();
			
			Thread.sleep(380);
		}
		
		if (dog1.health > dog2.health){
			System.out.print("\nThe winner is " + dog1.name );
		}else {
			System.out.print("\nThe winner is " + dog2.name );
		}
		
		
	}
	
}
