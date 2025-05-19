import java.util.concurrent.TimeUnit;

public class Update implements DataSource {

    @Override
    public void execute() {
    
    System.out.println("Updating...");
    try {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Data has been updated successfully!");
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    
        }
    
    }
}
