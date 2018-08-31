package pl.sda.design.pattern.bridge;

/**
 * Created by adam.
 */
public abstract class DatabaseConnection {

    public abstract void connectToDatabase(String host, int port);
    public abstract boolean disconnectFromDatabase();
    public abstract boolean insertRowToDB(Object row);

}
