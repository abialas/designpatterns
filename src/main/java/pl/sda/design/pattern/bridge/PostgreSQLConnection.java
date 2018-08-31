package pl.sda.design.pattern.bridge;

/**
 * Created by adam.
 */
public class PostgreSQLConnection extends DatabaseConnection {

    @Override
    public void connectToDatabase(String host, int port) {
        System.out.println(String.format("Connected to PostgreSQL db on host %s and port %d", host, port));
    }

    @Override
    public boolean disconnectFromDatabase() {
        System.out.println("Disconnected from PostgreSQL db");
        return true;
    }

    @Override
    public boolean insertRowToDB(Object row) {
        System.out.println("Row inserted to DB");
        return true;
    }
}
