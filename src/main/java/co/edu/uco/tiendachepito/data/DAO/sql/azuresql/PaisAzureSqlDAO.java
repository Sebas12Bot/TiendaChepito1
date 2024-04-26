package co.edu.uco.tiendachepito.data.DAO.sql.azuresql;

import co.edu.uco.tiendachepito.data.DAO.PaisDAO;
import co.edu.uco.tiendachepito.data.DAO.sql.SqlConnection;
import co.edu.uco.tiendachepito.entity.paisEntity;

import java.sql.Connection;
import java.util.List;

public final class PaisAzureSqlDAO extends SqlConnection implements PaisDAO{

    public PaisAzureSqlDAO(final Connection connection){
        super(connection);
    }

    @Override
    public final void actualizar(final paisEntity entidad) {
        final var sentenciaSql = new StringBuilder();
        sentenciaSql.append("UPDATE Pais");
        sentenciaSql.append("SET Nombre = 'Venezuela' ");
        sentenciaSql.append("WHERE Id = '1'");
    }

    @Override
    public final List<paisEntity> consultar(final paisEntity entidad) {
        final var sentenciaSql = new StringBuilder();
        sentenciaSql.append("SELECT  Id, Nombre");
        sentenciaSql.append("FROM Pais");
        sentenciaSql.append("ORDER BY Nombre ASC");
        return null;
    }

    @Override
    public final void crear(final paisEntity entidad) {
        final var sentenciaSql = new StringBuilder();
        sentenciaSql.append("INSERT INTO Pais(Nombre)");
        sentenciaSql.append("VALUES('Colombia')");
    }

    @Override
    public final void eliminar(final int id) {
        final var sentenciaSql = new StringBuilder();
        sentenciaSql.append("DELETE FROM Pais");
        sentenciaSql.append("WHERE Id = '1'");
    }
}
