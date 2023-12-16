package Var2;

public class Dog extends Pet{
    public void eat(){
        System.out.println("Гав!");
        if(getSatiety() <= 25){
            setSatiety(getSatiety()+75);
        }else{
            setSatiety(100);
        }
    }
    public void setInfoDog(){
        System.out.println("Введите кол-во собачек которое вы хотели бы создать? ");
        int count = scan.nextInt();
        Dog[] dog = new Dog[count];
        for (int i = 0; i < count; i++) {
            dog[i] = new Dog();
            System.out.println("Введите сытость " + (i+1) + " собачки");
            int tempCount = scan.nextInt();
            dog[i].setSatiety(tempCount);
        }
    }
}
