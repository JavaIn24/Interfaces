public class Bird implements Swimmable, Flyable {
    String name;
    int speed;
    double weight;

    public Bird(String name, int speed, double weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Обычнно птицы не плавают если ты " +
                "конечно не пингвин, или гусь, или утка, или лебедь.");
    }


    @Override
    public void fly() {
        if (weight < 10) {
            System.out.println("Основной метод передвижения птиц это полет, если у тебя достаточно небольшой вес до 10 килограмм" +
                    " если ты конечо не страус, или пингвин, или курица. ");
        }else {
            System.out.println("Вес этоq птицы по имени " + name + " не позволяет ей летать");
        }

    }
}
