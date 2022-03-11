package Fourth;

public class Main {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(2);
        executorService.submit(() -> {
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));
        executorService.shutdown();
    }
}
