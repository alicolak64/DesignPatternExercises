public class SynchronizedMethod {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.print();

    }

}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {

        if (instance == null)
            instance = new Singleton();

        return instance;

    }

    public void print() {
        System.out.println("Singleton Design Pattern");
    }

}
