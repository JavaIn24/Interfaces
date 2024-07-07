public class Fish implements Swimmable {
    String name;
    int age;
    int weight;

    public Fish(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Марлины могут плавать со скоростью выше 200 километров в час и считаются одними из самых быстрых обитателей океана в мире");
    }
}
