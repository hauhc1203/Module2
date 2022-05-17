package th1;

public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return "o o o o o";
    }

    @Override
    public String howToEat() {
        return "Nau chin";
    }
}
