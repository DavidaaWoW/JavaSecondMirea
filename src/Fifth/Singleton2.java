package Fifth;

public class Singleton2 {
    private Singleton2(){

    }
    private static class Singleton2Holder{
        private static final Singleton2 instance = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return Singleton2Holder.instance;
    }
}
