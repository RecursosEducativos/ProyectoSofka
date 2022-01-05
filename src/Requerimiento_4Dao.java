import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_4Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_4> requerimiento4()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_4> respuesta = new ArrayList<Requerimiento_4>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta ="select *from preguntas WHERE nivel == 4";
            
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_4 requerimiento_4 = new Requerimiento_4();
                requerimiento_4.setID_Pregunta(resulset.getInt("id_pregunta"));
                requerimiento_4.setNivel(resulset.getInt("nivel"));
                requerimiento_4.setEnunciado(resulset.getString("enunciado"));
                requerimiento_4.setResc(resulset.getString("resc"));
                requerimiento_4.setResi1(resulset.getString("resi1"));
                requerimiento_4.setResi2(resulset.getString("resi2"));
                requerimiento_4.setResi2(resulset.getString("resi2"));
                respuesta.add(requerimiento_4);

            }
            resulset.close();
            statement.close();
        }
        catch(SQLException e){
            System.err.println("Error consultado: "+ e);
        }
        finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }

}