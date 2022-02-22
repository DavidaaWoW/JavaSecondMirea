package Fifth;

public class Singleton {
    private static Singleton instance;
    private static boolean flag = true;
    private Singleton(){}
    public static Singleton getInstance(){
        if(flag){
            flag = false;
            instance = new Singleton();
            System.out.println("Success");
            return instance;
        }
        System.out.println("Fail");
        return instance;
    }
}
