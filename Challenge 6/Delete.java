import java.util.concurrent.TimeUnit;

public class Delete implements DataSource  {

    @Override
    public void execute() {
        System.out.println("Deleting...");
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Data has been deleted successfully!");
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
       
    }
}