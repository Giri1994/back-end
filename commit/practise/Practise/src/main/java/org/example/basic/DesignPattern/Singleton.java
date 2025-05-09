package org.example.basic.DesignPattern;

public class Singleton {


    // Volatile ensures visibility across threads
    private static volatile Singleton instance = null;

    // Private constructor prevents direct instantiation
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {  // First check (without synchronization)
            synchronized (Singleton.class) {  // Thread-safe lock
                if (instance == null) {  // Second check (double-checked locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

//    private static Singleton val = null;
//
//    static Singleton getInstance() {
//        if (val == null) {
//            val = new Singleton();
//        }
//        return val;
//    }

    public static void main(String arg[]) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        System.out.println("---------->" + x);
        System.out.println("---------->" + y);

        if(x==y)
            System.out.println("true");

    }
}
