class Dog extends AbstractAnimal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makan() {
        System.out.println(name + " makan daging");
    }

    @Override
    public void suara() {
        System.out.println(name + " guk guk");
    }
}
