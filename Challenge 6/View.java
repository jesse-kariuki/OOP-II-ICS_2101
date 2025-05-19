
public class View implements DataSource {

    @Override
    
    public void execute() {
    
    System.out.println("Fetching...");

    try {
        Thread.sleep(5000);
        System.out.println("Data has been fetched successfully!");
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    
    }
    
    }
}