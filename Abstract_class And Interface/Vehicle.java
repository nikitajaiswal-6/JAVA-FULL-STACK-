public abstract class Vehicle {   //Abstract class is 50% abstract and is used in the scenario where we have 50% knowledge of
                                 //about method implementation.

    String brand;

    Vehicle(String brand){
        this.brand=brand; //--This constructor will only set the value of instance variable.
    }

    abstract void start();

    public void m1(){
        System.out.println("hello m1"); //-- We can also have concrete methods in abstract class.
    }
}

class Thar extends Vehicle{

    Thar(String brand) {
        super(brand);  //--thar constructor will initialize the value of instance variable with its default value and provide space in  the memory.
    }

    @Override
    void start() {
        System.out
                .println("Vehicle--- "+brand+" Thar starts......");
    }

    public static void main(String[] args) {
        Thar t=new Thar("Mahindra");
        t.start();

    }
}