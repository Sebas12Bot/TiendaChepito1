package co.edu.uco.tiendachepito.data.DAO.sql;

import java.sql.Connection;

public class SqlConnection {

    private Connection connection;

    protected SqlConnection(final Connection connection) {
        this.connection = connection;
    }

    private void setConnection(Connection connection) {
        this.connection = connection;
    }

    protected final Connection getConnection() {
        return connection;
    }
}
