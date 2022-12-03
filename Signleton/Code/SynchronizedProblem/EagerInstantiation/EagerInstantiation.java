public class EagerInstantiation {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.print();

    }

}

class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("Singleton Design Pattern");
    }

}
