package oopskk;

class Singleton {
    // Step 1: Private static instance
    private static Singleton instance;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // create instance only once
        }
        return instance;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();  // Creates instance
        Singleton obj2 = Singleton.getInstance();  // Returns same instance

        System.out.println(obj1 == obj2);  // true
    }
}

