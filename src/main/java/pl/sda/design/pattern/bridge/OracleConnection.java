package pl.sda.design.pattern.bridge;

/**
 * Created by adam.
 */
public class OracleConnection extends DatabaseConnection {

    @Override
    public void connectToDatabase(String host, int port) {
        System.out.println(String.format("Connected to Oracle db on host %s and port %d", host, port));
    }

    @Override
    public boolean disconnectFromDatabase() {
        System.out.println("Disconnected from Oracle db");
        return true;
    }

    @Override
    public boolean insertRowToDB(Object row) {
        if (row == null) {
            return false;
        }
        System.out.println("Row inserted to DB");
        return true;
    }
}
