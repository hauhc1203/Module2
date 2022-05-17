package th1;

public class Main {
    public static void main(String[] args) {
        Animal tiger=new Tiger();
        Animal c=new Chicken();
        System.out.println(tiger.makeSound());
        if (c instanceof Chicken) {
            Edible edibler = (Chicken) c;
            System.out.println(edibler.howToEat());
        }

        Fruit fruit1=new Apple();
        System.out.println(fruit1.howToEat());
    }
}
