package app;

import enums.FurColor;
import model.Cat;

public class Main {
    public static void main(String[] args) {
        
        Cat cat = new Cat("Whiskers", 3, 4.2, FurColor.GRAY, true, "Sardinha", 25, false);

        cat.displayInfo();

        cat.makeSound();
        cat.sleep();
        cat.purr();

        cat.move(5);
        cat.move(5, 40);
        cat.move(5, "mouse");

        // Testando vidas
        cat.loseLife();
        System.out.println("Vidas: " + cat.getLives());
    }
}