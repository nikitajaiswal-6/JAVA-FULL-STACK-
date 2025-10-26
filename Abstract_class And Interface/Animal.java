public interface Animal { //-Interfaces are 100% abstract and is used in the scenario where we don't have any knowledge about
                          //method implementation.

    void makesound();

    void eat();

}

class Dog implements Animal{

    @Override
    public void makesound() {
        System.out.println("Dog bho-bho.......");
    }

    @Override
    public void eat() {
        System.out.println("Eats Milk-roti");
    }
}

class M{
    public static void main(String[] args) {
        Animal d=new Dog();
        d.eat();
        d.makesound();

    }
}
