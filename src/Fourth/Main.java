package Fourth;

public class Main {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(1);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
    }
}
