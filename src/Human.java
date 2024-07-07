public class Human implements Swimmable, Flyable{
    String name;
    int age;
    int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Люди, для плавания могут использовать различные стили, например брасом или дельфином");
    }

    @Override
    public void fly() {
        System.out.println("Люди обычно летают на самолетах, ну или космических ракетах, ну или прыгая со скалы" +
                " используя 'Wingsuit' ");
    }
}
