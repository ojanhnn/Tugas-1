public class Burung {
    String name;

    Burung(String name) {
        this.name = name;
    }

    public void makan() {
        System.out.println(name + " makan cacing");
    }

    public void suara() {
        System.out.println(name + " pik pik");
    }
}
