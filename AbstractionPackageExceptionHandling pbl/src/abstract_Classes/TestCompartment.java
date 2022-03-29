package abstract_Classes;

import java.util.Random;

public class TestCompartment {
	
public static void main(String[] args) {
	Compartment[] compartments = new Compartment[10];
	
	Random random = new Random();
	
	for (int i = 0; i < 10; i++) {
		int randomNum = random.nextInt(4) + 1;
		System.out.println(randomNum);
	
		if (randomNum == 1)
			compartments[i] = new FirstClass();
		else if (randomNum == 2)
			compartments[i] = new General();
		else if (randomNum == 3)
			compartments[i] = new Ladies();
		else compartments[i] = new Luggage();
	
		System.out.println(compartments[i].notice());
	}
}

}
