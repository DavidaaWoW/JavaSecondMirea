package Fifth;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();
        Singleton3 singleton5 = Singleton3.getInstance();
        Singleton3 singleton6 = Singleton3.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
        System.out.println(singleton5);
        System.out.println(singleton6);
    }
}
