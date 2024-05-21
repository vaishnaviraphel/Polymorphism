package Java_practice2.Polymorphism.methodoverriding;

public class output {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        Hound h1 = new Hound();
        h1.bark();

        Dog d2 = new Hound();
        d2.bark();             // Runtime or Method Overriding
    }
}
