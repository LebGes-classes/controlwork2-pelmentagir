package Var2;

public class Cat extends Pet {
    public void eat() {
        System.out.println("Мяу!");
        if (getSatiety() <= 25) {
            setSatiety(getSatiety() + 75);
        } else {
            setSatiety(100);
        }
    }
}

