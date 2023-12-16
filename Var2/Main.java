package Var2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во кошечек которое вы хотели бы создать? ");
        int count = scan.nextInt();
        Cat[] cat = new Cat[count];
        for (int i = 0; i < count; i++) {
            cat[i] = new Cat();
            System.out.println("Введите сытость " + (i + 1) + " кошечки");
            int tempCount = scan.nextInt();
            cat[i].setSatiety(tempCount);
        }
        System.out.println("Введите кол-во собачек которое вы хотели бы создать? ");
        int tcount = scan.nextInt();
        Dog[] dog = new Dog[tcount];
        for (int i = 0; i < tcount; i++) {
            dog[i] = new Dog();
            System.out.println("Введите сытость " + (i+1) + " собачки");
            int tempCount = scan.nextInt();
            dog[i].setSatiety(tempCount);
        }

        System.out.println("====== До того как поели собачки =======");
        for (int i = 0; i < dog.length; i++) {
            dog[i].getInfoNotEating();
        }

        System.out.println("====== До того как поели кошечки =======");
        for (int i = 0; i < cat.length; i++) {
            cat[i].getInfoNotEating();
        }
        System.out.println("====== после того как поели собачки =======");
        for (int i = 0; i < dog.length; i++) {
            dog[i].eat();
            dog[i].getInfoEating();
        }
        System.out.println("====== после того как поели кошечки =======");
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat();
            cat[i].getInfoEating();
        }
    }
}
