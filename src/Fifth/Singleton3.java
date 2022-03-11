package Fifth;

public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    static{
        try{
            instance = new Singleton3();
        }
        catch (Exception e){

        }
    }
    public static Singleton3 getInstance(){
        return instance;
    }
}
