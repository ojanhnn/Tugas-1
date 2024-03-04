class Cat extends AbstractAnimal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makan() {
        System.out.println(name + " makan ikan");
    }

    @Override
    public void suara() {
        System.out.println(name + " meow");
    }
}
