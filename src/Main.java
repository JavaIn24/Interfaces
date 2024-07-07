public class Main {
    public static void main(String[] args) {
        Human human = new Human("Игнат",23,75);
        Fish fish = new Fish("Luna", 2, 30);
        Bird bird = new Bird("Сапсан", 150, 0.1);
        Bird bird1 = new Bird("Силя", 70,70);
        human.swim();
        System.out.println("-----------------------------------");
        fish.swim();
        System.out.println("-----------------------------------");
        bird.swim();
        System.out.println("-----------------------------------");
        human.fly();
        System.out.println("-----------------------------------");
        bird.fly();
        System.out.println("-----------------------------------");
        bird1.fly();
    }
}
