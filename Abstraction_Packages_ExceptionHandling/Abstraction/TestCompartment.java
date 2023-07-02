package Abstraction_Packages_ExceptionHandling;

import java.util.Arrays;
import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "FirstClass";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies";
    }
}

class General extends Compartment {
    public String notice() {
        return "General";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage";
    }
}

public class TestCompartment {
    public static void main(String args[]) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            int randomNumber = random.nextInt(4 - 1 + 1) + 1;

            if (randomNumber == 1)
                compartments[i] = new Luggage();
            else if (randomNumber == 2)
                compartments[i] = new Ladies();
            else if (randomNumber == 3)
                compartments[i] = new General();
            else if (randomNumber == 4)
                compartments[i] = new FirstClass();

            System.out.println(compartments[i].notice());
        }

    }

}
