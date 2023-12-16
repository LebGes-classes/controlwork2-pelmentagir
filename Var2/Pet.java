package Var2;

import java.util.Scanner;

public abstract class Pet {
    private int satiety = 1;
    public abstract void eat();
    static Scanner scan = new Scanner(System.in);

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        if (satiety > 0 & satiety <= 100) {
            this.satiety = satiety;
        }else{
            this.satiety = 20;
        }
    }
    public void getInfoNotEating(){
        System.out.println(getSatiety());
    }
    public void getInfoEating(){

        System.out.println(getSatiety());
    }
}
