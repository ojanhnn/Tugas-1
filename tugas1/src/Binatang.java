public class Binatang {
    public static void main(String[] args) {
        Dog dog = new Dog("Helli");
        dog.suara();
        dog.makan();
        dog.jalan();

        Cat cat = new Cat("Meong");
        cat.suara();
        cat.makan();
        cat.jalan();

        Burung bird = new Burung("Flysky");
        bird.suara();
        bird.makan();
    }
}
