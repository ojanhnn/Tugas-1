abstract class AbstractAnimal implements MakhlukHidup {
    String name;

    AbstractAnimal(String name) {
        this.name = name;
    }

    abstract void makan();

    void jalan() {
        System.out.println(name + " berjalan");
    }
}
