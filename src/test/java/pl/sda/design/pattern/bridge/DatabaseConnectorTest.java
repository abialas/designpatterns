package pl.sda.design.pattern.bridge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class DatabaseConnectorTest {

    @Test
    public void testInsertNullRowToDBOracle() {
        DatabaseConnector connector = new RelationalDatabaseConnector(new OracleConnection());

        boolean rowInserted = connector.insertRowToDB("localhost", 1521, null);

        assertThat(rowInserted, equalTo(false));
    }

    @Test
    public void testInsertNullRowToDBPostgresql() {
        DatabaseConnector connector = new RelationalDatabaseConnector(new PostgreSQLConnection());

        boolean rowInserted = connector.insertRowToDB("localhost", 5432, null);

        assertThat(rowInserted, equalTo(true));
    }

}
