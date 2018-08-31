package pl.sda.design.pattern.bridge;

/**
 * Created by adam.
 */
public class RelationalDatabaseConnector extends DatabaseConnector {

    public RelationalDatabaseConnector(DatabaseConnection connection) {
        super(connection);
    }

    @Override
    public void connect(String host, int port) {
        connection.connectToDatabase(host, port);
    }

    @Override
    public void disconnect() {
        connection.disconnectFromDatabase();
    }

    @Override
    public boolean insertRowToDB(String host, int port, Object row) {
        connection.connectToDatabase(host, port);
        boolean rowInserted = connection.insertRowToDB(row);
        connection.disconnectFromDatabase();

        return rowInserted;
    }
}
