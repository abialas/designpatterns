package pl.sda.design.pattern.bridge;

/**
 * Created by adam.
 */
public abstract class DatabaseConnector {

    protected DatabaseConnection connection;

    public DatabaseConnector(DatabaseConnection connection) {
        this.connection = connection;
    }

    public abstract void connect(String host, int port);

    public abstract void disconnect();

    public abstract boolean insertRowToDB(String host, int port, Object row);

}
