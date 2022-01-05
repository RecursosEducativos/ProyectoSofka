import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    
    private static final String DATABASE_LOCATION = "d:\\preguntas.db";
    //"Conexión a la BD que se construyó en SQlite y esta ubicada en la partición D:/;

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+ DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

